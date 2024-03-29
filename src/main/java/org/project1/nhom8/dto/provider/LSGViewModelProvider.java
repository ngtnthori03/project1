package org.project1.nhom8.dto.provider;

import org.project1.nhom8.dto.LSGViewModel;
import org.project1.nhom8.model.GiaModel;
import org.project1.nhom8.repository.GiaRepository;
import org.project1.nhom8.util.data.convert.DefaultConverter;
import org.project1.nhom8.util.data.visual.DataHeader;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class LSGViewModelProvider {

    private final GiaRepository giaRepository;

    public LSGViewModelProvider() {
        this.giaRepository = new GiaRepository();
    }

    public List<LSGViewModel> getLSGViewModels(Integer maSPCT) {
        List<LSGViewModel> result = new ArrayList<>();

        List<GiaModel> giaModels = giaRepository.getLichSugia(maSPCT);

        for (GiaModel gia : giaModels) {
            result.add(LSGViewModel.builder()
                    .gia(gia.getGia())
                    .ngayCapNhat(gia.getNgayCapNhat())
                    .build());
        }

        return result;
    }

    public TableModel toTableModel(Integer maSPCT) {


        DefaultTableModel defaultTableModel =new DefaultTableModel();

        List<Field> fields = Arrays.asList(LSGViewModel.class.getDeclaredFields())
                .stream()
                .filter(o -> o.isAnnotationPresent(DataHeader.class))
                .collect(Collectors.toList());


        defaultTableModel.setColumnCount(0);
        for (Field f : fields) {
            defaultTableModel.addColumn(f.getAnnotation(DataHeader.class).name());
        }

        defaultTableModel.setRowCount(0);

        List<String> rowData = new ArrayList<>();

        for (LSGViewModel gia : this.getLSGViewModels(maSPCT)) {
            rowData = new ArrayList<>();
            try {
                for (Field j : fields) {
                    j.setAccessible(true);
                    if (j.getType().equals(Date.class)) {
                        rowData.add(DefaultConverter.VietnameseDateFormat((Date) j.get(gia)));
                    } else {
                        rowData.add(j.get(gia).toString());
                    }

                }
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            }

            defaultTableModel.addRow(rowData.toArray());
        }

        return defaultTableModel;
    }
}

package org.project1.nhom8.dto.provider;

import org.project1.nhom8.dto.HDCTViewModel;
import org.project1.nhom8.model.HDCTModel;
import org.project1.nhom8.model.SPCTModel;
import org.project1.nhom8.repository.GiaRepository;
import org.project1.nhom8.repository.HDCTRepository;
import org.project1.nhom8.repository.MauSacRepository;
import org.project1.nhom8.repository.SPCTRepository;
import org.project1.nhom8.repository.SanPhamRepository;
import org.project1.nhom8.repository.SizeRepository;
import org.project1.nhom8.service.KhuyenMaiService;
import org.project1.nhom8.util.data.convert.DateFormat;
import org.project1.nhom8.util.data.convert.DefaultConverter;
import org.project1.nhom8.util.data.visual.DataHeader;

import javax.swing.table.DefaultTableModel;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class HDCTViewModelProvider {

    private HDCTRepository hdctRepository;

    private GiaRepository giaRepository;

    private SPCTRepository spctRepository;
    private SizeRepository sizeRepository;

    private MauSacRepository mauSacRepository;

    private SanPhamRepository sanPhamRepository;

    private final KhuyenMaiService khuyenMaiService;

    public HDCTViewModelProvider() {
        this.hdctRepository = new HDCTRepository();

        this.spctRepository = new SPCTRepository();

        this.giaRepository = new GiaRepository();

        this.sizeRepository = new SizeRepository();

        this.mauSacRepository = new MauSacRepository();

        this.sanPhamRepository = new SanPhamRepository();

        this.khuyenMaiService = new KhuyenMaiService();
    }

    public List<HDCTViewModel> getHDCTViewModel(String maHD) {
        List<HDCTViewModel> result = new ArrayList<>();

        List<HDCTModel> hdctModels = hdctRepository.findBymaHD(maHD);

        SPCTModel spct = null;

        HDCTViewModel hdctvm = null;

        for (HDCTModel hdctm : hdctModels) {

            spct = spctRepository.findById(hdctm.getMaSPCT());

            hdctvm = new HDCTViewModel();

            hdctvm.setMaSPCT(hdctm.getMaSPCT());
            hdctvm.setMauSac(mauSacRepository.findById(spct.getMaMauSac()).getTenmau());
            hdctvm.setSize(sizeRepository.findById(spct.getMaSPCT()).getTensize());
            hdctvm.setGia(giaRepository.findById(hdctm.getMaLSG()).getGia());
            hdctvm.setTenSP(sanPhamRepository.findById(spct.getMaSP()).getTensp());
            hdctvm.setSoLuong(hdctm.getSoLuong());

            if (hdctm.getMaKM() != null) {
                hdctvm.setGiaKhuyenMai((double) spctRepository.getGiaKM(hdctm.getMaSPCT()));
            } else {
                hdctvm.setGiaKhuyenMai((double) 0);
            }

            result.add(hdctvm);
        }

        return result;
    }

    public DefaultTableModel toTableMode(String maHD) {
        DefaultTableModel defaultTableModel = new DefaultTableModel();

        List<Field> fields = Arrays.asList(HDCTViewModel.class.getDeclaredFields())
                .stream()
                .filter(o -> o.isAnnotationPresent(DataHeader.class))
                .collect(Collectors.toList());


        defaultTableModel.setColumnCount(0);
        for (Field f : fields) {
            defaultTableModel.addColumn(f.getAnnotation(DataHeader.class).name());
        }

        defaultTableModel.setRowCount(0);

        List<String> rowData = new ArrayList<>();

        for (HDCTViewModel hdct : this.getHDCTViewModel(maHD)) {
            rowData = new ArrayList<>();
            try {
                for (Field j : fields) {
                    j.setAccessible(true);
                    if (j.getType().equals(Date.class)
                        && j.isAnnotationPresent(DateFormat.class)) {
                        rowData.add(DefaultConverter.VietnameseDateFormat((Date) j.get(hdct)));
                    } else {
                        rowData.add(j.get(hdct).toString());
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

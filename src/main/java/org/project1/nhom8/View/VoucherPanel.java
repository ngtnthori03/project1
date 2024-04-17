package org.project1.nhom8.View;

import org.project1.nhom8.dto.provider.VoucherViewModelProvider;
import org.project1.nhom8.model.VoucherModel;
import org.project1.nhom8.repository.VoucherRepository;
import org.project1.nhom8.util.TrangThaiVoucher;
import org.project1.nhom8.util.swing.GeneralDocumentListener;
import org.project1.nhom8.util.swing.PopupNotification;
import org.project1.nhom8.util.swing.ValidatedTextField;

import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.Optional;

/**
 * @author ngtnthori03
 */
public class VoucherPanel extends javax.swing.JPanel {

    private ValidatedTextField validateCondPrice;
    private ValidatedTextField validatePrice;
    private PopupNotification condPricePopup;
    private ValidatedTextField quantityValidated;

    private VoucherModel voucherModel;

    private VoucherViewModelProvider voucherViewModelProvider;

    private VoucherRepository voucherRepository;

    /**
     * Creates new form VoucherPanel
     */
    public VoucherPanel() {
        initComponents();

        this.voucherViewModelProvider = new VoucherViewModelProvider();

        voucherRepository = new VoucherRepository();

        condPrice.getDocument().addDocumentListener(new GeneralDocumentListener() {
            @Override
            public void onChange() {
                if (!condPrice.getText().trim().matches("^[1-9]([0-9]+)?")) {
                    condPrice.setForeground(Color.RED);
                } else {
                    condPrice.setForeground(Color.GREEN);
                }
                validateForm();
            }
        });

        price.getDocument().addDocumentListener(new GeneralDocumentListener() {
            @Override
            public void onChange() {
                if (!price.getText().trim().matches("^[1-9]([0-9]+)?")) {
                    price.setForeground(Color.RED);
                } else {
                    price.setForeground(Color.GREEN);
                }
                validateForm();
            }
        });

        quantity.getDocument().addDocumentListener(new GeneralDocumentListener() {
            @Override
            public void onChange() {
                if (!quantity.getText().trim().matches("^[1-9]([0-9]+)?")) {
                    quantity.setForeground(Color.RED);
                } else {
                    quantity.setForeground(Color.GREEN);
                }
                validateForm();
            }
        });

        this.cencelVoucher.setEnabled(false);

        loadTable();
        clearForm();
        validateForm();
    }

    public void loadTable() {
        this.Voucherview.setModel(voucherViewModelProvider.toTableMode());
    }

    public void validateForm() {

        addVoucher.setEnabled(condPrice.getForeground().equals(Color.GREEN)
                && price.getForeground().equals(Color.GREEN)
                && quantity.getForeground().equals(Color.GREEN));

    }

    public void clearForm() {
        price.setText("");
        condPrice.setText("");
        quantity.setText("");
        startDate.setDate(new Date());
        endDate.setDate(new Date());
        this.cencelVoucher.setEnabled(false);
    }

    /**
     * mapping value to VoucherModel
     */
    public void map() {
        this.voucherModel = new VoucherModel();

        voucherModel.setMaVoucher("V" + voucherRepository.count() + 1);

        voucherModel.setDiauKien(Float.parseFloat(condPrice.getText().trim()));

        voucherModel.setGiaTri(Float.parseFloat(price.getText().trim()));

        voucherModel.setSoLuong(Integer.parseInt(quantity.getText().trim()));

        voucherModel.setNgayCapNhat(new Date());

        voucherModel.setNgayBatDau(startDate.getDate());
        voucherModel.setNgayKetThuc(endDate.getDate());

        voucherModel.setNgayTao(new Date());

        voucherModel.setTrangThai(TrangThaiVoucher.DANG_HOAT_DONG.getValue());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Voucherview = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        condPrice = new javax.swing.JTextField();
        addVoucher = new javax.swing.JButton();
        startDate = new com.toedter.calendar.JDateChooser();
        endDate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        quantity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cencelVoucher = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        Voucherview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Voucherview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoucherviewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Voucherview);

        jLabel1.setText("thời gian bắt đầu");

        jLabel4.setText("giá trị");

        jLabel5.setText("dieu kien");

        addVoucher.setText("add voucher");
        addVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVoucherActionPerformed(evt);
            }
        });

        jLabel2.setText("thời gian kết thúc");

        reset.setText("reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel3.setText("số lượng");

        cencelVoucher.setText("hủy voucher");
        cencelVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cencelVoucherActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("quản lý voucher");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(condPrice)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addVoucher)
                                        .addGap(35, 35, 35)
                                        .addComponent(cencelVoucher))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(startDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(price))
                                        .addGap(111, 111, 111)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset))
                                .addGap(0, 66, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(condPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addVoucher)
                        .addComponent(cencelVoucher))
                    .addComponent(reset))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVoucherActionPerformed

        if (startDate.getDate().compareTo(this.endDate.getDate()) > 0) {
            JOptionPane.showMessageDialog(this, "ngày bắt đầu phải trước ngày kết thức");
            return;
        }

        map();

        if (Optional.ofNullable(voucherRepository
                .add(voucherModel)).isPresent()) {
            JOptionPane.showMessageDialog(this, "them thanh cong");
            clearForm();
            loadTable();
        } else {
            JOptionPane.showMessageDialog(this, "them that bai");
        }

    }//GEN-LAST:event_addVoucherActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        this.clearForm();
    }//GEN-LAST:event_resetActionPerformed

    private void cencelVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cencelVoucherActionPerformed


//        if (new Date().compareTo(voucherModel.getNgayBatDau()) >= 0) {
//            JOptionPane.showMessageDialog(this, "không thể hủy hóa đơn đã bắt đầu (" + DefaultConverter.VietnameseDateFormat(voucherModel.getNgayBatDau()) + ")");
//            return;
//        }

        voucherModel.setTrangThai(TrangThaiVoucher.DA_HUY.getValue());
        voucherModel.setNgayCapNhat(new Date());

        if ((voucherRepository.update(voucherModel))) {
            loadTable();
            clearForm();
            JOptionPane.showMessageDialog(this
                    , "hủy voucher " + voucherModel.getMaVoucher() + " thành công");
        }
    }//GEN-LAST:event_cencelVoucherActionPerformed

    private void VoucherviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoucherviewMouseClicked

        String voucherId = voucherViewModelProvider.getVoucherViewModel()
                .get(Voucherview.getSelectedRow()).getMaVoucher();

        voucherModel = voucherRepository.findById(voucherId);

        if (Voucherview.getSelectedRow() >= 0
                && voucherModel.getTrangThai().equals(TrangThaiVoucher.DANG_HOAT_DONG.getValue())) {
            cencelVoucher.setEnabled(true);
        } else {
            cencelVoucher.setEnabled(false);
        }
    }//GEN-LAST:event_VoucherviewMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Voucherview;
    private javax.swing.JButton addVoucher;
    private javax.swing.JButton cencelVoucher;
    private javax.swing.JTextField condPrice;
    private com.toedter.calendar.JDateChooser endDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton reset;
    private com.toedter.calendar.JDateChooser startDate;
    // End of variables declaration//GEN-END:variables
}

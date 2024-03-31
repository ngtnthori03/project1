package org.project1.nhom8.View;

import org.project1.nhom8.dto.provider.VoucherViewModelProvider;
import org.project1.nhom8.model.VoucherModel;
import org.project1.nhom8.repository.VoucherRepository;
import org.project1.nhom8.util.TrangThaiVoucher;
import org.project1.nhom8.util.swing.ErrLabel;
import org.project1.nhom8.util.swing.PopupNotification;
import org.project1.nhom8.util.swing.ValidatedTextField;

import java.util.Date;
import java.util.Optional;
import javax.swing.JOptionPane;

/**
 *
 * @author ngtnthori03
 */
public class VoucherPanel extends javax.swing.JPanel {

    private ValidatedTextField validateCondPrice;
    private ValidatedTextField validatePrice;
    private PopupNotification condPricePopup;
    
    private VoucherModel voucherModel;

    private VoucherViewModelProvider voucherViewModelProvider;

    private VoucherRepository voucherRepository;
    
    /**
     * Creates new form VoucherPanel
     */
    public VoucherPanel() {
        initComponents();

        this.voucherViewModelProvider = new VoucherViewModelProvider();
        
        validateCondPrice  = new ValidatedTextField(
                condPrice, "^[0-9]?[.]?\\d+$"
                , condPriceErr, "");
        
        condPricePopup = new PopupNotification(condPrice, condPriceErr
                , new ErrLabel("gia tri phai la so lon hon 0"));
        
        validateCondPrice  = new ValidatedTextField(
                price, "^[0-9]?[.]?\\d+$"
                , priceErr, "");
        
        condPricePopup = new PopupNotification(price, priceErr
                , new ErrLabel("gia tri phai la so lon hon 0"));

        this.voucherRepository = new VoucherRepository();

        loadTable();
        clearForm();
    }

    public void loadTable() {
        this.Voucherview.setModel(voucherViewModelProvider.toTableMode());
    }

    public void clearForm() {
        price.setText("");;
        condPrice.setText("");
        startDate.setDate(new Date());
        endDate.setDate(new Date());
    }
    
    /**
     * mapping value to VoucherModel
     */
    public void map() {
        this.voucherModel = new VoucherModel();

        voucherModel.setMaVoucher("V" + voucherRepository.count()+1);

        voucherModel.setDiauKien(Float.parseFloat(condPrice.getText().trim()));

        voucherModel.setGiaTri(Float.parseFloat(price.getText().trim()));

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
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        startDate = new com.toedter.calendar.JDateChooser();
        endDate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        condPriceErr = new javax.swing.JLabel();
        priceErr = new javax.swing.JLabel();
        dateErr = new javax.swing.JLabel();

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
        jScrollPane1.setViewportView(Voucherview);

        jLabel1.setText("thời gian bắt đầu");

        jLabel4.setText("giá trị");

        jLabel5.setText("dieu kien");

        jButton5.setText("add voucher");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("reset");

        jLabel2.setText("thời gian kết thúc");

        condPriceErr.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        condPriceErr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        condPriceErr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/validate-err.png"))); // NOI18N

        priceErr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceErr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/validate-err.png"))); // NOI18N

        dateErr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateErr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/validate-war.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(32, 32, 32)
                        .addComponent(jButton6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addComponent(condPrice, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(condPriceErr, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateErr, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(price))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priceErr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(265, 265, 265))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(condPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceErr, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))
                            .addComponent(condPriceErr, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dateErr, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        map();
        
        if (Optional.ofNullable(voucherRepository
                .add(voucherModel)).isPresent()) {
            JOptionPane.showMessageDialog(this, "tham thanh cong");
            clearForm();
            loadTable();
        }
        else {
            JOptionPane.showMessageDialog(this, "tham that bai");
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Voucherview;
    private javax.swing.JTextField condPrice;
    private javax.swing.JLabel condPriceErr;
    private javax.swing.JLabel dateErr;
    private com.toedter.calendar.JDateChooser endDate;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField price;
    private javax.swing.JLabel priceErr;
    private com.toedter.calendar.JDateChooser startDate;
    // End of variables declaration//GEN-END:variables
}

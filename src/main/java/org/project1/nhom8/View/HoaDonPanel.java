/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.project1.nhom8.View;

import org.project1.nhom8.dto.HoaDonViewModel;
import org.project1.nhom8.dto.provider.HDCTViewModelProvider;
import org.project1.nhom8.dto.provider.HDViewModelProvider;
import org.project1.nhom8.repository.HDCTRepository;
import org.project1.nhom8.repository.HoaDonRepository;

import java.util.List;
import javax.swing.JComponent;
import org.project1.nhom8.dto.HDSearchDTO;
import org.project1.nhom8.util.swing.GeneralDocumentListener;

/**
 * @author ngtnthori03
 */
public class HoaDonPanel extends javax.swing.JPanel {


    private String maHD;

    private HoaDonRepository hoaDonRepository;

    private HDCTRepository hdctRepository;

    private HDViewModelProvider hdViewModelProvider;

    private HDCTViewModelProvider hdctViewModelProvider;

    /**
     * Creates new form HoaDonPanel
     */
    public HoaDonPanel() {
        initComponents();

        this.hdViewModelProvider = new HDViewModelProvider();

        this.hoaDonRepository = new HoaDonRepository();

        this.hdctRepository = new HDCTRepository();

        this.hdctViewModelProvider = new HDCTViewModelProvider();
        
        
        // disable search button when invoice id text box empty
        invoiceId.getDocument().addDocumentListener(new GeneralDocumentListener() {
        
            @Override
            public void onChange() {
                if (invoiceId.getText().trim().matches("[a-zA-Z0-9]+")) {
                    search.setEnabled(true);
                } else {
                    search.setEnabled(false);
                }
            }
        });
        
        clear();

        loadInvoiceView(hdViewModelProvider.getHoaDonViewModel());
    }

    public void loadInvoiceView(List<HoaDonViewModel> models) {
        invoiceView.setModel(hdViewModelProvider
                .toTableMode(models));
    }

    public void clear() {
        invoiceId.setText("");
        
        search.setEnabled(false);
        
        byCreationTime.setSelected(false);
        beginCreationDate.setEnabled(false);
        endCreationDate.setEnabled(false);
        
        byPaymentTime.setSelected(false);
        beginPaymantDate.setEnabled(false);
        endPaymantDate.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceView = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        invoiceDetailView = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        invoiceId = new javax.swing.JTextField();
        beginCreationDate = new com.toedter.calendar.JDateChooser();
        endCreationDate = new com.toedter.calendar.JDateChooser();
        search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        endPaymantDate = new com.toedter.calendar.JDateChooser();
        beginPaymantDate = new com.toedter.calendar.JDateChooser();
        reset = new javax.swing.JButton();
        byCreationTime = new javax.swing.JCheckBox();
        byPaymentTime = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        invoiceHistoryName = new javax.swing.JTextField();
        invoiceHistoryPhoneNumber = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        historySearch = new javax.swing.JButton();

        invoiceView.setModel(new javax.swing.table.DefaultTableModel(
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
        invoiceView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invoiceViewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(invoiceView);

        jTabbedPane1.addTab("hóa đơn", jScrollPane1);

        invoiceDetailView.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(invoiceDetailView);

        jTabbedPane1.addTab("danh sách sản phẩm", jScrollPane2);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kíem hóa đơn"));

        search.setText("tìm kiếm");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel1.setText("ma hoa don");

        reset.setText("reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        byCreationTime.setText("ngày tạo");
        byCreationTime.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                byCreationTimeStateChanged(evt);
            }
        });

        byPaymentTime.setText("ngày thanh toán");
        byPaymentTime.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                byPaymentTimeStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invoiceId, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(beginCreationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(endCreationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(byCreationTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(beginPaymantDate, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(endPaymantDate, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(byPaymentTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(invoiceId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(byCreationTime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(beginCreationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(endCreationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(39, 39, 39)
                        .addComponent(search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reset))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(byPaymentTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(beginPaymantDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endPaymantDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lịch sử mua hàng"));

        jButton3.setText("xuất lịch sử");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Tên Khách hàng");

        jLabel7.setText("Số Diện Thoại");

        historySearch.setText("tìm kiếm");
        historySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historySearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(invoiceHistoryPhoneNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(historySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(invoiceHistoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invoiceHistoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceHistoryPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historySearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

        HDSearchDTO dto = new HDSearchDTO();
        
        if (byCreationTime.isSelected()) {
            dto.setBeginCreationDate(beginCreationDate.getDate());
            dto.setEndCreationDate(endCreationDate.getDate());
        }
        
        if (byPaymentTime.isSelected()) {
            dto.setBeginPaymenetDate(beginPaymantDate.getDate());
            dto.setEndPaymentDate(endPaymantDate.getDate());
        }
        
        loadInvoiceView(hdViewModelProvider.getModels(hoaDonRepository
                        .search(invoiceId.getText().trim(), dto)));

    }//GEN-LAST:event_searchActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        loadInvoiceView(hdViewModelProvider.getHoaDonViewModel());
    }//GEN-LAST:event_resetActionPerformed

    private void invoiceViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoiceViewMouseClicked
        // TODO add your handling code here:

        this.maHD = hdViewModelProvider.getHoaDonViewModel().
                get(invoiceView.getSelectedRow()).getMaHoaDon();

        this.invoiceDetailView.setModel(hdctViewModelProvider
                .toTableMode(this.maHD));
    }//GEN-LAST:event_invoiceViewMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void byCreationTimeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_byCreationTimeStateChanged
        if(byCreationTime.isSelected()) {
            enables(true, new JComponent[] {beginCreationDate, endCreationDate});
        } else {
            enables(false, new JComponent[] {beginCreationDate, endCreationDate});
        }
    }//GEN-LAST:event_byCreationTimeStateChanged

    private void historySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historySearchActionPerformed
        loadInvoiceView(hdViewModelProvider.getModels(hoaDonRepository
                .findByMaKhachHangAndSDT(invoiceHistoryName.getText().trim()
                        , invoiceHistoryPhoneNumber.getText().trim())));
    }//GEN-LAST:event_historySearchActionPerformed

    private void byPaymentTimeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_byPaymentTimeStateChanged
        
        if(byPaymentTime.isSelected()) {
            enables(true, new JComponent[] {beginPaymantDate, endPaymantDate});
        } else {
            enables(false, new JComponent[] {beginPaymantDate, endPaymantDate});
        }
        
    }//GEN-LAST:event_byPaymentTimeStateChanged

    public void enables(Boolean value, JComponent[] components) {
        for (JComponent component: components) {
            component.setEnabled(value);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser beginCreationDate;
    private com.toedter.calendar.JDateChooser beginPaymantDate;
    private javax.swing.JCheckBox byCreationTime;
    private javax.swing.JCheckBox byPaymentTime;
    private com.toedter.calendar.JDateChooser endCreationDate;
    private com.toedter.calendar.JDateChooser endPaymantDate;
    private javax.swing.JButton historySearch;
    private javax.swing.JTable invoiceDetailView;
    private javax.swing.JTextField invoiceHistoryName;
    private javax.swing.JTextField invoiceHistoryPhoneNumber;
    private javax.swing.JTextField invoiceId;
    private javax.swing.JTable invoiceView;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton reset;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}

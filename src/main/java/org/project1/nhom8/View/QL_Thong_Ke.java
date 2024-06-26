/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.project1.nhom8.View;

import org.jfree.chart.JFreeChart;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.style.Styler;
import org.project1.nhom8.dto.ProductRevenue;
import org.project1.nhom8.dto.RevenueByMonth;
import org.project1.nhom8.model.ThongKeModel;
import org.project1.nhom8.repository.ThongKeConnection;
import org.project1.nhom8.service.ThongKeService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author acer
 */
public class QL_Thong_Ke extends javax.swing.JPanel {

    /**
     * Creates new form QL_Thong_Ke
     */
    ThongKeConnection tkc = new ThongKeConnection();
    DefaultTableModel defaultTableModel;
    ThongKeService ql = new ThongKeService();

    private CategoryChart categoryChart;
    private PieChart pieChart;

    private JFreeChart revenueByMonthChart;

    public QL_Thong_Ke() {
        initComponents();
        ArrayList<ThongKeModel> list = ql.getlist();
        LoadData(list);
        ArrayList<ThongKeModel> listSP = ql.listSp();
        LoadSP(listSP);
        Tong();

        categoryChart = new CategoryChartBuilder()
                .title("Doanh thu")
                .xAxisTitle("thời gian")
                .yAxisTitle("doanh thu")
                .width(100)
                .height(100)
                .build();
        categoryChart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);

        revenuePanel.setLayout(new BorderLayout());
        revenuePanel.add(new XChartPanel<>(categoryChart));
        revenuePanel.validate();

        drawRevenueByMonthChart(tkc.getRevenueByMonth());


        pieChart = new PieChartBuilder()
                .width(800)
                .height(600)
                .title(getClass()
                        .getSimpleName()).build();

        productRevenue.setLayout(new BorderLayout());
        productRevenue.add(new XChartPanel<>(pieChart));
        productRevenue.validate();

        drawProductRevenue(tkc.getProductRevenue());
    }

    public void drawRevenueByMonthChart(List<RevenueByMonth> rbms) {


        List<String> monthYear = rbms.stream().map(o -> o.getMonth() + "")
                .toList();
        List<Double> revenues = rbms.stream().map(o -> o.getRevenue())
                .collect(Collectors.toList());

        categoryChart.removeSeries("doanh thu");
        categoryChart.addSeries("doanh thu", monthYear, revenues);
    }

    public void drawProductRevenue(List<ProductRevenue> prs) {

        for (ProductRevenue pr : prs) {
            pieChart.addSeries(pr.getName(), pr.getRevenue());
        }

    }

    public void LoadData(ArrayList<ThongKeModel> list) {
        defaultTableModel = (DefaultTableModel) tblThongKe.getModel();
        defaultTableModel.setRowCount(0);
        for (ThongKeModel tk : list) {
            defaultTableModel.addRow(new Object[]{
                    tk.getMa(),
                    tk.getTen(),
                    tk.getSl(),
                    tk.getNgay(),
                    tk.getGia(),
                    tk.thanhTien()

            });
        }
    }

    public void LoadSP(ArrayList<ThongKeModel> list) {
        defaultTableModel = (DefaultTableModel) tblSP.getModel();
        defaultTableModel.setRowCount(0);
        for (ThongKeModel sp : list) {
            defaultTableModel.addRow(new Object[]{
                    sp.getTenSP(),
                    sp.getMau(),
                    sp.getSize(),
                    sp.getSlMua()
            });
        }

    }

    private void Tong() {
        DecimalFormat x = new DecimalFormat("###,###,###");
        int Tong = 0;
        for (int i = 0; i < tblThongKe.getRowCount(); i++) {
            Tong += Float.parseFloat(tblThongKe.getValueAt(i, 5).toString());
        }
        jLabelTongDanhThu.setText("Tổng Danh Thu : " + x.format(Tong) + "" + "VND");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelTongDanhThu = new javax.swing.JLabel();
        txtNgayBD = new com.toedter.calendar.JDateChooser();
        btnTK = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNgayKT = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongKe = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();
        revenuePanel = new javax.swing.JPanel();
        productRevenue = new javax.swing.JPanel();

        setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("THỐNG KÊ");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Tìm Kiếm Theo Ngày");

        jLabelTongDanhThu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTongDanhThu.setText(" DOANH THU :");

        txtNgayBD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNgayBDMouseClicked(evt);
            }
        });
        txtNgayBD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNgayBDKeyReleased(evt);
            }
        });

        btnTK.setText("Tim Kiem");
        btnTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTKMouseClicked(evt);
            }
        });

        jLabel3.setText("Từ:");

        jLabel4.setText("Đến:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabelTongDanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(75, 75, 75)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTK))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(180, 180, 180))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelTongDanhThu)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnTK)
                                .addGap(15, 15, 15))
        );

        tblThongKe.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String[]{
                        "Mã Sản Phẩm", "Tên Sản Phẩm ", "Số Lượng ", "Ngày", "Giá ", "Thành Tiền "
                }
        ));
        tblThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThongKeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblThongKe);

        jTabbedPane1.addTab("toanh thu", jScrollPane1);

        tblSP.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "Tên SP", "Màu ", "Size", "Số lượng mua"
                }
        ));
        jScrollPane2.setViewportView(tblSP);

        jTabbedPane1.addTab("sản pẩm bán", jScrollPane2);

        javax.swing.GroupLayout revenuePanelLayout = new javax.swing.GroupLayout(revenuePanel);
        revenuePanel.setLayout(revenuePanelLayout);
        revenuePanelLayout.setHorizontalGroup(
                revenuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1048, Short.MAX_VALUE)
        );
        revenuePanelLayout.setVerticalGroup(
                revenuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 489, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("doang thu  theo tháng", revenuePanel);

        javax.swing.GroupLayout productRevenueLayout = new javax.swing.GroupLayout(productRevenue);
        productRevenue.setLayout(productRevenueLayout);
        productRevenueLayout.setHorizontalGroup(
                productRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1048, Short.MAX_VALUE)
        );
        productRevenueLayout.setVerticalGroup(
                productRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 489, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("doanh thu theo sản phẩm", productRevenue);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(456, 456, 456))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1048, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNgayBDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNgayBDKeyReleased
        // TODO add your handling code here:
        Date ngaybd = txtNgayBD.getDate();
        Date ngaykt = txtNgayKT.getDate();
        ArrayList<ThongKeModel> list = ql.timKiem(ngaybd, ngaykt);
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Khong co thong ke");
        } else {
            LoadData(list);
            drawProductRevenue(tkc.getProductRevenue(ngaybd, ngaykt));
            drawProductRevenue(tkc.getProductRevenue(ngaybd, ngaykt));

        }
    }//GEN-LAST:event_txtNgayBDKeyReleased

    private void txtNgayBDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNgayBDMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_txtNgayBDMouseClicked

    private void btnTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKMouseClicked
        // TODO add your handling code here:
        Date ngaybd = txtNgayBD.getDate();
        Date ngaykt = txtNgayKT.getDate();
        ArrayList<ThongKeModel> list = ql.timKiem(ngaybd, ngaykt);
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Khong co thong ke");
        } else {
            LoadData(list);
            Tong();
        }
    }//GEN-LAST:event_btnTKMouseClicked

    private void tblThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThongKeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblThongKeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTK;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelTongDanhThu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel productRevenue;
    private javax.swing.JPanel revenuePanel;
    private javax.swing.JTable tblSP;
    private javax.swing.JTable tblThongKe;
    private com.toedter.calendar.JDateChooser txtNgayBD;
    private com.toedter.calendar.JDateChooser txtNgayKT;
    // End of variables declaration//GEN-END:variables

}

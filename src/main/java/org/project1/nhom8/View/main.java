/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.project1.nhom8.View;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.project1.nhom8.model.Login;
import org.project1.nhom8.service.LoginService;
import org.project1.nhom8.util.VaiTroNhanVien;

/**
 *
 * @author PC
 */
public class main extends javax.swing.JFrame {

    private Login logged = LoginService.lg;
    
    public main() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(this.MAXIMIZED_BOTH);
        setColor(lblBanHang);
        setColorJpanel(pnBanHang);
        showPanel(new Form_BanHang());
        
        
        if (logged.getVaiTro().equals(VaiTroNhanVien.nhan_vien.getValue())) {
            enables(false, new JComponent[] {
                pnSanPham
                    , pnHoaDon
                    , pnGiagia
                    , pnNhanVien
                    , pnThongke
                    , pnVoucher
            });
            pnBanHang.setEnabled(false);
        }
    }
    
    public void enables(Boolean value, JComponent[] comonents) {
        
        for (JComponent comp: comonents) {
            comp.setEnabled(value);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnBanHang = new javax.swing.JPanel();
        lblBanHang = new javax.swing.JLabel();
        pnSanPham = new javax.swing.JPanel();
        lblSanPham = new javax.swing.JLabel();
        pnHoaDon = new javax.swing.JPanel();
        lblHoaDon = new javax.swing.JLabel();
        pnNhanVien = new javax.swing.JPanel();
        lblNhanVien = new javax.swing.JLabel();
        pnKhachHang = new javax.swing.JPanel();
        lblKhachHang = new javax.swing.JLabel();
        pnThongke = new javax.swing.JPanel();
        lblThongke = new javax.swing.JLabel();
        pnGiagia = new javax.swing.JPanel();
        lblGiamGia = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnVoucher = new javax.swing.JPanel();
        lblVoucher = new javax.swing.JLabel();
        pnDangXuat = new javax.swing.JPanel();
        lblDangXuat = new javax.swing.JLabel();
        lblNameNV = new javax.swing.JLabel();
        pnscrene = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(41, 93, 157));
        jPanel4.setToolTipText("");
        jPanel4.setPreferredSize(new java.awt.Dimension(260, 780));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        pnBanHang.setBackground(new java.awt.Color(41, 93, 157));
        pnBanHang.setPreferredSize(new java.awt.Dimension(242, 60));
        pnBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnBanHangMouseClicked(evt);
            }
        });

        lblBanHang.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblBanHang.setForeground(new java.awt.Color(255, 255, 255));
        lblBanHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cart-36-xl.png"))); // NOI18N
        lblBanHang.setText("Bán hàng");

        javax.swing.GroupLayout pnBanHangLayout = new javax.swing.GroupLayout(pnBanHang);
        pnBanHang.setLayout(pnBanHangLayout);
        pnBanHangLayout.setHorizontalGroup(
            pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBanHangLayout.createSequentialGroup()
                .addComponent(lblBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        pnBanHangLayout.setVerticalGroup(
            pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBanHangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(pnBanHang);

        pnSanPham.setBackground(new java.awt.Color(41, 93, 157));
        pnSanPham.setPreferredSize(new java.awt.Dimension(241, 60));
        pnSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnSanPhamMouseClicked(evt);
            }
        });

        lblSanPham.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/product-xl.png"))); // NOI18N
        lblSanPham.setText("Sản phẩm");

        javax.swing.GroupLayout pnSanPhamLayout = new javax.swing.GroupLayout(pnSanPham);
        pnSanPham.setLayout(pnSanPhamLayout);
        pnSanPhamLayout.setHorizontalGroup(
            pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
            .addGroup(pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnSanPhamLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );
        pnSanPhamLayout.setVerticalGroup(
            pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnSanPhamLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel1.add(pnSanPham);

        pnHoaDon.setBackground(new java.awt.Color(41, 93, 157));
        pnHoaDon.setPreferredSize(new java.awt.Dimension(243, 60));
        pnHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnHoaDonMouseClicked(evt);
            }
        });

        lblHoaDon.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        lblHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bill-xl.png"))); // NOI18N
        lblHoaDon.setText("Hóa đơn");

        javax.swing.GroupLayout pnHoaDonLayout = new javax.swing.GroupLayout(pnHoaDon);
        pnHoaDon.setLayout(pnHoaDonLayout);
        pnHoaDonLayout.setHorizontalGroup(
            pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHoaDonLayout.createSequentialGroup()
                .addComponent(lblHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        pnHoaDonLayout.setVerticalGroup(
            pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(pnHoaDon);

        pnNhanVien.setBackground(new java.awt.Color(41, 93, 157));
        pnNhanVien.setPreferredSize(new java.awt.Dimension(241, 60));
        pnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnNhanVienMouseClicked(evt);
            }
        });

        lblNhanVien.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lblNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/6.png"))); // NOI18N
        lblNhanVien.setText("Nhân viên");

        javax.swing.GroupLayout pnNhanVienLayout = new javax.swing.GroupLayout(pnNhanVien);
        pnNhanVien.setLayout(pnNhanVienLayout);
        pnNhanVienLayout.setHorizontalGroup(
            pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhanVienLayout.createSequentialGroup()
                .addComponent(lblNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        pnNhanVienLayout.setVerticalGroup(
            pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhanVienLayout.createSequentialGroup()
                .addComponent(lblNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel1.add(pnNhanVien);

        pnKhachHang.setBackground(new java.awt.Color(41, 93, 157));
        pnKhachHang.setPreferredSize(new java.awt.Dimension(241, 60));
        pnKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnKhachHangMouseClicked(evt);
            }
        });

        lblKhachHang.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        lblKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/7.png"))); // NOI18N
        lblKhachHang.setText("Khách hàng");

        javax.swing.GroupLayout pnKhachHangLayout = new javax.swing.GroupLayout(pnKhachHang);
        pnKhachHang.setLayout(pnKhachHangLayout);
        pnKhachHangLayout.setHorizontalGroup(
            pnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnKhachHangLayout.setVerticalGroup(
            pnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnKhachHangLayout.createSequentialGroup()
                .addComponent(lblKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(pnKhachHang);

        pnThongke.setBackground(new java.awt.Color(41, 93, 157));
        pnThongke.setPreferredSize(new java.awt.Dimension(241, 60));
        pnThongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnThongkeMouseClicked(evt);
            }
        });

        lblThongke.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblThongke.setForeground(new java.awt.Color(255, 255, 255));
        lblThongke.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/5.png"))); // NOI18N
        lblThongke.setText("Thống kê");

        javax.swing.GroupLayout pnThongkeLayout = new javax.swing.GroupLayout(pnThongke);
        pnThongke.setLayout(pnThongkeLayout);
        pnThongkeLayout.setHorizontalGroup(
            pnThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongkeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnThongkeLayout.setVerticalGroup(
            pnThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongkeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnThongke);

        pnGiagia.setBackground(new java.awt.Color(41, 93, 157));
        pnGiagia.setPreferredSize(new java.awt.Dimension(260, 60));
        pnGiagia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnGiagiaMouseClicked(evt);
            }
        });

        lblGiamGia.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblGiamGia.setForeground(new java.awt.Color(255, 255, 255));
        lblGiamGia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGiamGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sale-25.png"))); // NOI18N
        lblGiamGia.setText("Khuyến mãi");

        javax.swing.GroupLayout pnGiagiaLayout = new javax.swing.GroupLayout(pnGiagia);
        pnGiagia.setLayout(pnGiagiaLayout);
        pnGiagiaLayout.setHorizontalGroup(
            pnGiagiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGiagiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnGiagiaLayout.setVerticalGroup(
            pnGiagiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGiagiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnGiagia);

        jPanel2.setBackground(new java.awt.Color(41, 93, 157));

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);

        pnVoucher.setBackground(new java.awt.Color(41, 93, 157));
        pnVoucher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnVoucherMouseClicked(evt);
            }
        });

        lblVoucher.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblVoucher.setForeground(new java.awt.Color(255, 255, 255));
        lblVoucher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVoucher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/4.png"))); // NOI18N
        lblVoucher.setText("Voucher");

        javax.swing.GroupLayout pnVoucherLayout = new javax.swing.GroupLayout(pnVoucher);
        pnVoucher.setLayout(pnVoucherLayout);
        pnVoucherLayout.setHorizontalGroup(
            pnVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVoucherLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        pnVoucherLayout.setVerticalGroup(
            pnVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVoucherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnVoucher);

        pnDangXuat.setBackground(new java.awt.Color(41, 93, 157));
        pnDangXuat.setPreferredSize(new java.awt.Dimension(241, 60));
        pnDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnDangXuatMouseClicked(evt);
            }
        });

        lblDangXuat.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        lblDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/8.png"))); // NOI18N
        lblDangXuat.setText("Đăng xuất");

        javax.swing.GroupLayout pnDangXuatLayout = new javax.swing.GroupLayout(pnDangXuat);
        pnDangXuat.setLayout(pnDangXuatLayout);
        pnDangXuatLayout.setHorizontalGroup(
            pnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDangXuatLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnDangXuatLayout.setVerticalGroup(
            pnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDangXuatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(pnDangXuat);

        lblNameNV.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        lblNameNV.setForeground(new java.awt.Color(255, 255, 255));
        lblNameNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameNV.setText("LV STORE");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNameNV, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblNameNV, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pnscrene.setBackground(new java.awt.Color(255, 255, 255));
        pnscrene.setPreferredSize(new java.awt.Dimension(1159, 0));
        pnscrene.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnscrene, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
            .addComponent(pnscrene, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnSanPhamMouseClicked
        // TODO add your handling code here:
        
        if (logged.getVaiTro().equals(VaiTroNhanVien.nhan_vien.getValue())) {
            return;
        }
        
        setColorJpanel(pnSanPham);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnGiagia);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnKhachHang);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnThongke);
        setColor(lblSanPham);
        resetColor(lblNhanVien);
        resetColor(lblKhachHang);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblThongke);
        resetColor(lblGiamGia);
        resetColor(lblDangXuat);
        resetColorJpane(pnDangXuat);
        resetColor(lblVoucher);
        resetColorJpane(pnVoucher);
        showPanel(new QL_SanPham());
    }//GEN-LAST:event_pnSanPhamMouseClicked

    private void pnHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnHoaDonMouseClicked
        // TODO add your handling code here:
        
        if (logged.getVaiTro().equals(VaiTroNhanVien.nhan_vien.getValue())) {
            return;
        }
        
        setColorJpanel(pnHoaDon);
        resetColorJpane(pnSanPham);
        resetColorJpane(pnGiagia);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnKhachHang);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnThongke);
        setColor(lblHoaDon);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        resetColor(lblKhachHang);
        resetColor(lblBanHang);
        resetColor(lblThongke);
        resetColor(lblDangXuat);
        resetColorJpane(pnDangXuat);
        resetColor(lblVoucher);
        resetColorJpane(pnVoucher);
        showPanel(new HoaDonPanel());
    }//GEN-LAST:event_pnHoaDonMouseClicked

    private void pnNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnNhanVienMouseClicked
        // TODO add your handling code here:
        
        if (logged.getVaiTro().equals(VaiTroNhanVien.nhan_vien.getValue())) {
            return;
        }
        
        setColorJpanel(pnNhanVien);
        resetColorJpane(pnSanPham);
        resetColorJpane(pnGiagia);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnKhachHang);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnThongke);
        setColor(lblNhanVien);
        resetColor(lblSanPham);
        resetColor(lblKhachHang);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblThongke);
        resetColor(lblDangXuat);
        resetColorJpane(pnDangXuat);
        resetColor(lblVoucher);
        resetColorJpane(pnVoucher);
        showPanel(new Form_NhanVien());

    }//GEN-LAST:event_pnNhanVienMouseClicked

    private void pnKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnKhachHangMouseClicked
        // TODO add your handling code here:
        
        if (logged.getVaiTro().equals(VaiTroNhanVien.nhan_vien.getValue())) {
            return;
        }
        
        setColorJpanel(pnKhachHang);
        resetColorJpane(pnSanPham);
        resetColorJpane(pnGiagia);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnThongke);
        setColor(lblKhachHang);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblThongke);
        resetColor(lblDangXuat);
        resetColorJpane(pnDangXuat);
        resetColor(lblVoucher);
        resetColorJpane(pnVoucher);
        showPanel(new QL_Khach_Hang());
    }//GEN-LAST:event_pnKhachHangMouseClicked

    private void pnThongkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnThongkeMouseClicked
        // TODO add your handling code here:
        
        if (logged.getVaiTro().equals(VaiTroNhanVien.nhan_vien.getValue())) {
            return;
        }
        
        setColorJpanel(pnThongke);
        resetColorJpane(pnSanPham);
        resetColorJpane(pnGiagia);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnKhachHang);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnBanHang);
        setColor(lblThongke);
        resetColor(lblSanPham);
        resetColor(lblKhachHang);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblNhanVien);
        resetColor(lblGiamGia);
        resetColor(lblDangXuat);
        resetColorJpane(pnDangXuat);
        resetColor(lblVoucher);
        resetColorJpane(pnVoucher);
        showPanel(new QL_Thong_Ke());
    }//GEN-LAST:event_pnThongkeMouseClicked

    private void pnGiagiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnGiagiaMouseClicked
        // TODO add your handling code here:
        
        if (logged.getVaiTro().equals(VaiTroNhanVien.nhan_vien.getValue())) {
            return;
        }
        
        setColorJpanel(pnGiagia);
        resetColorJpane(pnSanPham);
        resetColorJpane(pnThongke);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnKhachHang);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnBanHang);
        setColor(lblGiamGia);
        resetColor(lblSanPham);
        resetColor(lblKhachHang);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblNhanVien);
        resetColor(lblThongke);
        resetColor(lblDangXuat);
        resetColorJpane(pnDangXuat);
        resetColor(lblVoucher);
        resetColorJpane(pnVoucher);
        showPanel(new QL_KhuyenMai1());
    }//GEN-LAST:event_pnGiagiaMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        jPopupMenu1.show(evt.getComponent(), -45, 70);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void pnBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBanHangMouseClicked
        // TODO add your handling code here:
        setColorJpanel(pnBanHang);
        resetColorJpane(pnSanPham);
        resetColorJpane(pnGiagia);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnKhachHang);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnThongke);

        setColor(lblBanHang);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        resetColor(lblKhachHang);
        resetColor(lblHoaDon);
        resetColor(lblThongke);
        resetColor(lblGiamGia);
        resetColor(lblDangXuat);
        resetColorJpane(pnDangXuat);
        resetColor(lblVoucher);
        resetColorJpane(pnVoucher);
        showPanel(new Form_BanHang());
    }//GEN-LAST:event_pnBanHangMouseClicked

    private void pnDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnDangXuatMouseClicked
        // TODO add your handling code here:
        setColor(lblDangXuat);
        setColorJpanel(pnDangXuat);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        resetColor(lblKhachHang);
        resetColor(lblHoaDon);
        resetColor(lblThongke);
        resetColor(lblGiamGia);
        resetColor(lblBanHang);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnSanPham);
        resetColorJpane(pnGiagia);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnKhachHang);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnThongke);
        resetColor(lblVoucher);
        resetColorJpane(pnVoucher);
        int option = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?", "Xác nhận Đăng Xuất", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            main.this.dispose();
            new LoginDialog().setVisible(true);
        }
    }//GEN-LAST:event_pnDangXuatMouseClicked

    private void pnVoucherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnVoucherMouseClicked
        // TODO add your handling code here:
        
        if (logged.getVaiTro().equals(VaiTroNhanVien.nhan_vien.getValue())) {
            return;
        }
        
        setColor(lblVoucher);
        setColorJpanel(pnVoucher);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        resetColor(lblKhachHang);
        resetColor(lblHoaDon);
        resetColor(lblThongke);
        resetColor(lblGiamGia);
        resetColor(lblBanHang);
        resetColorJpane(pnBanHang);
        resetColorJpane(pnSanPham);
        resetColorJpane(pnGiagia);
        resetColorJpane(pnNhanVien);
        resetColorJpane(pnKhachHang);
        resetColorJpane(pnHoaDon);
        resetColorJpane(pnThongke);
        resetColor(lblDangXuat);
        resetColorJpane(pnDangXuat);
        showPanel(new VoucherPanel());
    }//GEN-LAST:event_pnVoucherMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lblBanHang;
    private javax.swing.JLabel lblDangXuat;
    private javax.swing.JLabel lblGiamGia;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblKhachHang;
    private javax.swing.JLabel lblNameNV;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblThongke;
    private javax.swing.JLabel lblVoucher;
    private javax.swing.JPanel pnBanHang;
    private javax.swing.JPanel pnDangXuat;
    private javax.swing.JPanel pnGiagia;
    private javax.swing.JPanel pnHoaDon;
    private javax.swing.JPanel pnKhachHang;
    private javax.swing.JPanel pnNhanVien;
    private javax.swing.JPanel pnSanPham;
    private javax.swing.JPanel pnThongke;
    private javax.swing.JPanel pnVoucher;
    private javax.swing.JPanel pnscrene;
    // End of variables declaration//GEN-END:variables
    private JPanel chidrenpanel;

    public void showPanel(JPanel panel) {
        chidrenpanel = panel;
        pnscrene.removeAll();
        pnscrene.add(panel);
        pnscrene.validate();
    }

    public void setColorJpanel(JPanel pane) {
        pane.setBackground(new java.awt.Color(55, 148, 254));
    }

    public void resetColorJpane(JPanel pane) {
        pane.setBackground(new java.awt.Color(41, 93, 157));
    }

    public void setColor(JLabel label) {
        label.setForeground(Color.black);
    }

    public void resetColor(JLabel label) {
        label.setForeground(Color.white);
    }
}

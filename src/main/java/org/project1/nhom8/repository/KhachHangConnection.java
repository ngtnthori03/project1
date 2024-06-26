/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.project1.nhom8.repository;

import org.project1.nhom8.model.KhachHangModel;
import org.project1.nhom8.service.DBConnect;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author acer
 */
public class KhachHangConnection {

    DBConnect dBConnect;

    public ArrayList<KhachHangModel> getAll() {
        String sql = "Select * from KHACH_HANG";
        ArrayList<KhachHangModel> list = new ArrayList<>();
        try (Connection con = dBConnect.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Integer ma = rs.getInt("MAKH");
                String ten = rs.getString("TENKH");
                String sdt = rs.getString("SDT");
                String gioiTinh = rs.getString("GIOITINH");
                String email = rs.getString("EMAIL");
                Date ngay = rs.getDate("NGAYSINH");
                String diaChi = rs.getString("DIACHI");
                KhachHangModel kh = new KhachHangModel(ma, ten, sdt, gioiTinh, email, ngay, diaChi);

                list.add(kh);

            }
        } catch (Exception e) {
        }
        return list;
    }

    public Boolean add(KhachHangModel kh) {
        String sql = "insert into KHACH_HANG (  TENKH, SDT,GIOITINH,EMAIL,NGAYSINH,DIACHI)\n"
                + "values ( ? ,?,?, ?,?,?)";

        try (Connection con = dBConnect.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setObject(1, kh.getTen());
            pst.setString(2, kh.getSdt());
            pst.setObject(3, kh.getGioiTinh());
            pst.setObject(4, kh.getEmail());
            pst.setObject(5, kh.getNgay());
            pst.setObject(6, kh.getDiaChi());
            int kq = pst.executeUpdate();
            return kq > 0;
        } catch (Exception e) {
        }
        return false;
    }

    public Boolean remove(int ma) {
        String sql = "delete KHACH_HANG where MAKH = ?";
        try (Connection con = dBConnect.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setObject(1, ma);

            int kq = pst.executeUpdate();
            return kq > 0;
        } catch (Exception e) {
        }
        return false;

    }

    public Boolean Update(Integer mak, KhachHangModel khachHang) {
        String sql = "	update KHACH_HANG\n"
                + "set TENKH = ?,\n"
                + "	SDT = ?,\n"
                + "	GIOITINH=?,\n"
                + "	EMAIl = ?,\n"
                + "	NGAYSINH = ?,\n"
                + "	DIACHI = ?\n"
                + "	where MAKH = ?";

        try (Connection con = dBConnect.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setObject(1, khachHang.getTen());
            pst.setObject(2, khachHang.getSdt());
            pst.setObject(3, khachHang.getGioiTinh());
            pst.setObject(4, khachHang.getEmail());
            pst.setObject(5, khachHang.getNgay());
            pst.setObject(6, khachHang.getDiaChi());
            pst.setObject(7, mak);

            int kq = pst.executeUpdate();
            return kq > 0;
        } catch (Exception e) {
        }
        return false;
    }

    public ArrayList<KhachHangModel> timKiem(String ten1) {
        String sql = "select * from KHACH_HANG Where TENKH like '%" + ten1 + "%'";
        ArrayList<KhachHangModel> list = new ArrayList<>();
        try (Connection con = dBConnect.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Integer ma = rs.getInt("MAKH");
                String ten = rs.getString("TENKH");
                String sdt = rs.getString("SDT");
                String gioiTinh = rs.getString("GIOITINH");
                String email = rs.getString("EMAIL");
                Date ngay = rs.getDate("NGAYSINH");
                String diaChi = rs.getString("DIACHI");
                KhachHangModel kh = new KhachHangModel(ma, ten, sdt, gioiTinh, email, ngay, diaChi);
                list.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * @param maKH customer id
     * @return null if cannot find
     */
    public String getTenByMa(Integer maKH) {

        String query = "SELECT\n" +
                "    KHACH_HANG.TENKH\n" +
                "FROM KHACH_HANG\n" +
                "WHERE KHACH_HANG.MAKH = ?";

        try {

            Connection connection = DBConnect.getConnection();

            PreparedStatement preStat = connection.prepareStatement(query);

            preStat.setInt(1, maKH);

            ResultSet rs = preStat.executeQuery();

            if (rs.next()) {
                return rs.getString(1);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public KhachHangModel findByPhoneNumber(String phoneNumber) {

        String query = """
                SELECT
                        *
                    FROM KHACH_HANG
                    WHERE KHACH_HANG.SDT LIKE ?
                    """;

        try {

            Connection connection = DBConnect.getConnection();

            PreparedStatement preStat = connection.prepareStatement(query);

            preStat.setString(1, phoneNumber);

            ResultSet rs = preStat.executeQuery();

            if (rs.next()) {
                Integer ma = rs.getInt("MAKH");
                String ten = rs.getString("TENKH");
                String sdt = rs.getString("SDT");
                String gioiTinh = rs.getString("GIOITINH");
                String email = rs.getString("EMAIL");
                Date ngay = rs.getDate("NGAYSINH");
                String diaChi = rs.getString("DIACHI");
                KhachHangModel kh = new KhachHangModel(ma, ten, sdt, gioiTinh, email, ngay, diaChi);

                return kh;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public KhachHangModel findByNameAndPhoneNumber(String name, String phoneNumber) {

        String query = """
                SELECT
                        *
                    FROM KHACH_HANG
                    WHERE KHACH_HANG.TENKH LIKE ?
                    AND KHACH_HANG.SDT LIKE ?
                    """;
        try {

            Connection connection = DBConnect.getConnection();

            PreparedStatement preStat = connection.prepareStatement(query);

            preStat.setNString(1, name);
            preStat.setString(2, phoneNumber);

            ResultSet rs = preStat.executeQuery();

            if (rs.next()) {
                Integer ma = rs.getInt("MAKH");
                String ten = rs.getString("TENKH");
                String sdt = rs.getString("SDT");
                String gioiTinh = rs.getString("GIOITINH");
                String email = rs.getString("EMAIL");
                Date ngay = rs.getDate("NGAYSINH");
                String diaChi = rs.getString("DIACHI");
                KhachHangModel kh = new KhachHangModel(ma, ten, sdt, gioiTinh, email, ngay, diaChi);

                return kh;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public KhachHangModel findById(Integer id) {

        String query = """
                    
                SELECT
                        *
                    FROM KHACH_HANG
                    WHERE KHACH_HANG.MAKH = ?
                    """;

        try {

            Connection connection = DBConnect.getConnection();

            PreparedStatement preStat = connection.prepareStatement(query);

            preStat.setInt(1, id);

            ResultSet rs = preStat.executeQuery();

            if (rs.next()) {
                Integer ma = rs.getInt("MAKH");
                String ten = rs.getString("TENKH");
                String sdt = rs.getString("SDT");
                String gioiTinh = rs.getString("GIOITINH");
                String email = rs.getString("EMAIL");
                Date ngay = rs.getDate("NGAYSINH");
                String diaChi = rs.getString("DIACHI");
                KhachHangModel kh = new KhachHangModel(ma, ten, sdt, gioiTinh, email, ngay, diaChi);


                return kh;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}

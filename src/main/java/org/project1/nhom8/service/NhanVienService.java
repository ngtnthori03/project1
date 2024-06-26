/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.project1.nhom8.service;

import org.project1.nhom8.model.NhanVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NhanVienService {

    private List<NhanVien> listNV;
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public List<NhanVien> getAll() {
        listNV = new ArrayList<>();
        sql = "SELECT MANV,TENNV,SDT,EMAIL,GIOTINH,CCCD,MATKHAU,VAITRO,TRANGTHAI FROM NHAN_VIEN WHERE TRANGTHAI = N'Đang làm việc' ";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
                listNV.add(nv);
            }
            return listNV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int add(NhanVien nv) {
        sql = "INSERT INTO NHAN_VIEN(TENNV,SDT,EMAIL,GIOTINH,MATKHAU,CCCD,VAITRO,TRANGTHAI) VALUES(?,?,?,?,?,?,?,?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nv.getHoTen());
            ps.setString(2, nv.getSdt());
            ps.setString(3, nv.getEmail());
            ps.setString(4, nv.getGioiTinh());
            ps.setString(5, nv.getMatKhau());
            ps.setString(6, nv.getCCCD());
            ps.setString(7, nv.getVaiTro());
            ps.setString(8, nv.getTrangThai());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }

    public int update(int ma, NhanVien nv) {
        sql = "UPDATE NHAN_VIEN SET TENNV = ?, SDT = ?,EMAIL = ?,GIOTINH = ?,MATKHAU = ?, CCCD = ?,TRANGTHAI = ? WHERE MANV = ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nv.getHoTen());
            ps.setString(2, nv.getSdt());
            ps.setString(3, nv.getEmail());
            ps.setString(4, nv.getGioiTinh());
            ps.setString(5, nv.getMatKhau());
            ps.setString(6, nv.getCCCD());
            ps.setString(7, nv.getTrangThai());
            ps.setInt(8, ma);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List<NhanVien> timKiem(int ma) {
        listNV = new ArrayList<>();
        sql = "SELECT MANV,TENNV,SDT,EMAIL,GIOTINH,CCCD,MATKHAU,VAITRO,TRANGTHAI FROM NHAN_VIEN WHERE MANV like ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
                listNV.add(nv);
            }
            return listNV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public List<NhanVien> locTT(String trangThai) {
        listNV = new ArrayList<>();
        con = DBConnect.getConnection();
        sql = "select * from  NHAN_VIEN where TRANGTHAI like ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, trangThai);
            rs = ps.executeQuery();
            while (rs.next()) {

                NhanVien nv = new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));

                listNV.add(nv);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return listNV;
    }

    public List<NhanVien> locVT(String vaiTro) {
        listNV = new ArrayList<>();
        con = DBConnect.getConnection();
        sql = "select * from  NHAN_VIEN where VAITRO like ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, vaiTro);
            rs = ps.executeQuery();
            while (rs.next()) {

                NhanVien nv = new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));

                listNV.add(nv);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return listNV;
    }

    //    public int layMa() {
//        sql = "SELECT MANV FROM NHAN_VIEN";
//        int maMoi = 0;
//        try {
//            con = DBConnect.getConnection();
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                maMoi = rs.getInt(1) + 1;
//            }
//        } catch (Exception e) {
//        }
//        return maMoi;
//    }
//    public int deleteKM(int ma){
//        String sql= "Update NHAN_VIEN set TrangThai = N'Ngh? vi?c' where MANV = ?";
//        try{
//            Connection con = DBConnect.getConnection();
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, ma);
//            return ps.executeUpdate(); // th�m, s?a, x�a : executeUpdate
//            
//        }catch(Exception e){
//            e.printStackTrace();
//                    return 0;
//        }
//
//    }
    public boolean isSDT(String sdt) {
        con = DBConnect.getConnection();
        sql = " select count(*) from NHAN_VIEN where SDT = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, sdt);
            rs = ps.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public int deleteKM(int ma) {
        String sql = "Update NHAN_VIEN set TrangThai = N'Nghỉ việc' where MANV = ?";
        try {
            Connection con = DBConnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ma);
            return ps.executeUpdate(); // Thêm, sửa, xóa: executeUpdate

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0; // insert, update failed
    }

    public NhanVien findByEmail(String email) {

        sql = "SELECT MANV,TENNV,SDT,EMAIL,GIOTINH,CCCD,MATKHAU,VAITRO,TRANGTHAI FROM NHAN_VIEN WHERE EMAIL like ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next())
                return new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    public NhanVien findById(int ma) {
        sql = "SELECT MANV,TENNV,SDT,EMAIL,GIOTINH,CCCD,MATKHAU,VAITRO,TRANGTHAI FROM NHAN_VIEN WHERE MANV like ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ma);
            rs = ps.executeQuery();

            if (rs.next()) {
                return new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }
}

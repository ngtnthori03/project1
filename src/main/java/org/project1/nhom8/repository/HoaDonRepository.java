/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.project1.nhom8.repository;

import org.project1.nhom8.model.HoaDonModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ngtnthori03
 */
public class HoaDonRepository extends GeneralRepository<HoaDonModel, String> {

    public HoaDonRepository() {
        super(HoaDonModel.class);
    }

    public List<HoaDonModel> findByMaKhachHangAndSDT(String tenKhachHang, String SDT) {

        List<HoaDonModel> result = new ArrayList<>();

        String query = getQueryGenerator().generateSelectAllQuery()
                + "\n"
                + "\n\tJOIN  KHACH_HANG on KHACH_HANG.MAKH = HOA_DON.MAKH"
                + "\n\tWHERE TENKH LIKE ? AND KHACH_HANG.SDT = ?";

        try {
            PreparedStatement preStat = getConnection().prepareStatement(query);

            preStat.setNString(1, tenKhachHang);
            preStat.setString(2, SDT);

            ResultSet resultSet = preStat.executeQuery();

            if (resultSet.isBeforeFirst()) {
                while (resultSet.next()) {
                    result.add(getQueryGenerator().map(resultSet));
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        System.out.println(query);

        return result;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import model.VoucherModel;

/**
 *
 * @author ngtnthori03
 */
public class VoucherRepository extends GeneralRepository<VoucherModel, String>{

    public VoucherRepository() {
        super(VoucherModel.class);
    }
}

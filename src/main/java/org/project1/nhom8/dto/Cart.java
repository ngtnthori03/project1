package org.project1.nhom8.dto;

import org.project1.nhom8.model.VoucherModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cart {

    private String invoiceId;

    private String customerName;

    // id customer exists in DB
    private String customerPhoneNumber;

    private Date creationDate;

    private VoucherModel voucher;

    private List<CartDetail> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public Cart(String customerName, String customerPhoneNumber) {

        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;

        this.products = new ArrayList<>();
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public VoucherModel getVoucher() {
        return voucher;
    }

    public void setVoucher(VoucherModel voucher) {
        this.voucher = voucher;
    }

    public List<CartDetail> getProducts() {
        return products;
    }

    public void setProducts(List<CartDetail> products) {
        this.products = products;
    }
}

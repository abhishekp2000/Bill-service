package com.example.Billservice.entity;

public class Bill {
    private int billNo;
    private int billAmount;
    private int customerId;
    private String billDate;

    public Bill(int billNo, int billAmount, int customerId, String billDate) {
        this.billNo = billNo;
        this.billAmount = billAmount;
        this.customerId = customerId;
        this.billDate = billDate;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public Bill(){

    }

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public int getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(int billAmount) {
        this.billAmount = billAmount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}

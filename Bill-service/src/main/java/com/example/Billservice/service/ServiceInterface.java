package com.example.Billservice.service;

import com.example.Billservice.entity.Bill;

import java.util.List;

public interface ServiceInterface {
    Bill addBill(Bill bill);
    public List<Bill> getBillOfCustomer(long customerId);
}

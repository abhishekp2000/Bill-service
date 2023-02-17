package com.example.Billservice.service;

import com.example.Billservice.entity.Bill;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class ServiceImpl implements ServiceInterface{
    /*List<Bill> billList=List.of(
            new Bill(1,12000,1224,"12-01-2021"),
            new Bill(2,20000,1236,"26-01-2023"),
            new Bill(3,10000,1248,"10-01-2023")

    );*/
    List<Bill> billList=new ArrayList<>();


    @Override
    public Bill addBill(Bill bill) {
        billList.add(bill);
        return bill;
    }

    @Override
    public List<Bill> getBillOfCustomer(long customerId) {
           return this.billList.stream().filter(bill -> bill.getCustomerId()==(customerId)).collect(Collectors.toList());
    }
}

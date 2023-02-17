package com.example.Billservice.controller;

import com.example.Billservice.entity.Bill;
import com.example.Billservice.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping
public class Controller {
    @Autowired
    private ServiceInterface serviceInterface;
    @RequestMapping("/bill/customer/{customerId}")
    public List<Bill> getBill(@PathVariable long customerId){
        return this.serviceInterface.getBillOfCustomer(customerId);

    }
    @PostMapping("/bill/addbill")
    public Bill addBill(@RequestBody Bill bill1) {
        Bill bill = serviceInterface.addBill(bill1);

        return bill;
    }
}

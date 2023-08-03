package com.csi.service;

import com.csi.model.Orders;
import com.csi.repo.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrdersServiceImpl {

    @Autowired
    OrdersRepo  ordersRepoImpl;


    public Orders saveData(Orders orders) {

        return ordersRepoImpl.save(orders);
    }

    public Optional<Orders> getDataById(int orderId) {

        return ordersRepoImpl.findById(orderId);
    }
}

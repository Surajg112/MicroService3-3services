package com.csi.controller;

import com.csi.model.Orders;
import com.csi.service.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    OrdersServiceImpl ordersServiceImpl;

    @PostMapping("/")
    public ResponseEntity<Orders> saveData(@RequestBody Orders orders){
        return ResponseEntity.ok(ordersServiceImpl.saveData(orders));
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<Optional<Orders>> getDataByOrderId(@PathVariable int orderId){
        return ResponseEntity.ok(ordersServiceImpl.getDataById(orderId));
    }
}

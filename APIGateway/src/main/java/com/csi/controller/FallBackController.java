package com.csi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/customerfallback")
    public ResponseEntity<String> customerFallBack(){
        return ResponseEntity.ok("Customer Service is down please wait!!!!!");
    }

    @GetMapping("/productfallback")
    public ResponseEntity<String> productFallBack(){
        return ResponseEntity.ok("Product Service is down please wait!!!!!");
    }

    @GetMapping("/orderfallback")
    public ResponseEntity<String> orderFallBack(){
        return ResponseEntity.ok("Order Service is down please wait");
    }
}

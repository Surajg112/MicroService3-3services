package com.csi.controller;

import com.csi.model.Product;
import com.csi.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductServiceImpl productServiceImpl;

    @PostMapping("/")
    public ResponseEntity<Product> saveData(@RequestBody Product product){
        return ResponseEntity.ok(productServiceImpl.saveData(product));
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Optional<Product>> getDataById(@PathVariable int productId){
        return ResponseEntity.ok(productServiceImpl.getDataById(productId));
    }
}

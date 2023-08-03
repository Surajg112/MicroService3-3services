package com.csi.service;

import com.csi.model.Product;
import com.csi.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl {

    @Autowired
    ProductRepo productRepoImpl;


    public Product saveData(Product product) {

        return productRepoImpl.save(product);
    }

    public Optional<Product> getDataById(int productId) {

        return productRepoImpl.findById(productId);
    }
}

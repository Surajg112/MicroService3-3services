package com.csi.service;

import com.csi.model.Customer;
import com.csi.repo.CustomerRepo;
import com.csi.vo.Orders;
import com.csi.vo.Product;
import com.csi.vo.RestTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl {

    @Autowired
    CustomerRepo customerRepoImpl;

    @Autowired
    OrderFeignClientService orderFeignClientService;

    @Autowired
    ProductFeignClientService productFeignClientService;


    public Customer saveData(Customer customer) {

        return customerRepoImpl.save(customer);
    }

    public RestTemplateVO getDataById(int custId) {

        RestTemplateVO restTemplateVO = new RestTemplateVO();

        Customer customer = customerRepoImpl.findById(custId).get();

        Product product = productFeignClientService.getDataByProductId(customer.getProductId());

        Orders orders = orderFeignClientService.getDataByOrderId(customer.getOredrId());

        restTemplateVO.setCustomer(customer);
        restTemplateVO.setProduct(product);
        restTemplateVO.setOrders(orders);

        return restTemplateVO;
    }
}

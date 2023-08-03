package com.csi.service;

import com.csi.vo.Orders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "OrderService", url = "http://localhost:9191")
public interface OrderFeignClientService {

    @GetMapping("/orders/{orderId}")
    public Orders getDataByOrderId(@PathVariable int orderId);
}

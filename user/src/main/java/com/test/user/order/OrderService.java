package com.test.user.order;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "order-server")
public interface OrderService {

    @GetMapping("/api/order/get")
    JSONObject get();

}

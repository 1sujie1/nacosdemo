package com.test.user.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test.user.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/user/")
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    OrderService orderService;

    @GetMapping("get")
    public JSONObject get() {
        String url = "http://order-server/api/order/get";
        JSONObject object = restTemplate.getForObject(url, JSONObject.class);
        return object;
    }

    @GetMapping("openFeignGet")
    public JSONObject openFeignGet() {
        return orderService.get();
    }

}

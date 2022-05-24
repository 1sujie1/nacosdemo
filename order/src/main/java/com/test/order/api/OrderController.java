package com.test.order.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test.order.config.OrderConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/order/")
public class OrderController {

    @Autowired
    OrderConfig orderConfig;

    @Value("${server.port}")
    String port;

    @GetMapping("get")
    public JSONObject get() {
        log.info("port:" + port);
        return JSONObject.parseObject(JSON.toJSONString(orderConfig));
    }

}

package com.test.seataorder.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(value = "seata-user-service")
public interface AccountService {

    @LoadBalanced
    @PostMapping("/api/user/consumer")
    JSONObject consumer(@RequestBody JSONObject params);

}

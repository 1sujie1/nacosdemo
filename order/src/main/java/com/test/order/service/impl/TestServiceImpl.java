package com.test.order.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.test.order.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestServiceImpl implements TestService {

    @Override
    public JSONObject getInfo(int id, String name) {
        log.info("id:{}", id);
        log.info("name:{}", name);
        JSONObject object = new JSONObject(true);
        object.put("code", 0);
        object.put("message", "success");
        return object;
    }

}

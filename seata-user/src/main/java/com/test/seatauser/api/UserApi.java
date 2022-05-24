package com.test.seatauser.api;

import com.alibaba.fastjson.JSONObject;
import com.test.seatauser.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/user/")
public class UserApi {

    @Autowired
    AccountService accountService;

    @PostMapping("consumer")
    public JSONObject consumer(@RequestBody JSONObject params) {
        JSONObject result = new JSONObject(true);
        result.put("code", -1);
        result.put("msg", "");
        int userId = params.getInteger("user_id");
        int money = params.getInteger("money");

        int flag = accountService.reduceMoney(userId, money);
        if (flag > 0) {
            log.info("扣费成功");
            result.put("code", 0);
            result.put("msg", "操作成功");
            return result;
        }
        log.info("扣费失败");
        result.put("msg", "扣费失败");
        return result;
    }

}

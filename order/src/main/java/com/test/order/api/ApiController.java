package com.test.order.api;

import com.test.order.config.AccountConfig;
import com.test.order.config.UserConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/")
public class ApiController {

    @Autowired
    UserConfig userConfig;

    @Autowired
    AccountConfig accountConfig;

    @RequestMapping("user")
    public String user() {
        System.out.println(userConfig.getUserName());
        System.out.println(userConfig.getAge());
        return "success";
    }

    @RequestMapping("account")
    public String test() {
        System.out.println(accountConfig.getName());
        System.out.println(accountConfig.getBalance());
        return "success";
    }

}

package com.test.seataorder.api;

import com.alibaba.fastjson.JSONObject;
import com.test.seataorder.entity.Order;
import com.test.seataorder.service.AccountService;
import com.test.seataorder.service.OrderService;
import com.test.seataorder.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order/")
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    StorageService storageService;

    @Autowired
    AccountService accountService;

    @GlobalTransactional
    @PostMapping("create")
    public JSONObject create(@RequestBody Order order) {
        JSONObject result = new JSONObject();
        result.put("code", -1);
        result.put("msg", "");

        //创建订单
        orderService.createOrder(order);

        //扣款
        JSONObject accountParam = new JSONObject();
        accountParam.put("user_id", order.getUserId());
        accountParam.put("money", order.getMoney());
        accountService.consumer(accountParam);

        //扣库存
        JSONObject storageParam = new JSONObject();
        storageParam.put("commodity_code", order.getCommodityCode());
        storageParam.put("count", order.getCount());
        storageService.deduct(storageParam);


        result.put("code", 0);
        result.put("msg", "success");
        return result;
    }

}

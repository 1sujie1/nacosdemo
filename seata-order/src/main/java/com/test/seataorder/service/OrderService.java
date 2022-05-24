package com.test.seataorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.test.seataorder.entity.Order;

public interface OrderService extends IService<Order> {

    boolean createOrder(Order order);

}

package com.test.seataorder.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.seataorder.entity.Order;
import com.test.seataorder.mapper.OrderMapper;
import com.test.seataorder.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Transactional
    @Override
    public boolean createOrder(Order order) {
        return this.save(order);
    }
}

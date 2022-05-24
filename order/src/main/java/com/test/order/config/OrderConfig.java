package com.test.order.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
@AllArgsConstructor
@NoArgsConstructor
@Data
@RefreshScope
public class OrderConfig {

    @Value("${order.userId}")
    private int userId;

    @Value("${order.orderId}")
    private String orderId;

    @Value("${order.orderMoney}")
    private BigDecimal orderMoney;

}

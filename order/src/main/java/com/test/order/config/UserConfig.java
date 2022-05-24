package com.test.order.config;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
@NoArgsConstructor
@Data
@RefreshScope
public class UserConfig {

    @Value("${user.userName}")
    private String userName;

    @Value(value = "${user.age}")
    private int age;

}

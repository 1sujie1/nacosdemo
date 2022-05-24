package com.test.seataorder.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.seataorder.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}

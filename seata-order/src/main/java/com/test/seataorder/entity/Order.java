package com.test.seataorder.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@TableName("order_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String userId;

    private String commodityCode;

    private int count;

    private int money;

}

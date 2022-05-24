package com.test.seatauser.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@TableName("account_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String user_id;

    private int money;

}

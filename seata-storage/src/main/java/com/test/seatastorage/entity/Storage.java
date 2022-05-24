package com.test.seatastorage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@TableName("storage_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage implements Serializable {

    @TableId(type = IdType.AUTO)
    private int id;

    private String commodityCode;

    private int count;

}

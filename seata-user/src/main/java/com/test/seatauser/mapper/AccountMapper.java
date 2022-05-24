package com.test.seatauser.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.seatauser.entity.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper extends BaseMapper<Account> {
}

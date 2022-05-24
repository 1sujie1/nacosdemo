package com.test.seatauser.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.seatauser.entity.Account;
import com.test.seatauser.mapper.AccountMapper;
import com.test.seatauser.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

    @Transactional
    @Override
    public int reduceMoney(int userId, int money) {
        UpdateWrapper wrapper = new UpdateWrapper<Account>();
//        wrapper.set("money",)
        wrapper.setSql("money=money-" + money);
        wrapper.eq("id", userId);
        int result = this.update(wrapper) ? 1 : 0;
        return result;
    }

}

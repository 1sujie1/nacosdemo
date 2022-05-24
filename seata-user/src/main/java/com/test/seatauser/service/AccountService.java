package com.test.seatauser.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.test.seatauser.entity.Account;

public interface AccountService extends IService<Account> {

    int reduceMoney(int userId, int money);

}

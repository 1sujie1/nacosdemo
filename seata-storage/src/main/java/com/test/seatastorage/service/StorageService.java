package com.test.seatastorage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.test.seatastorage.entity.Storage;

public interface StorageService extends IService<Storage> {

    boolean deduct(String commodityCode, int count);

}

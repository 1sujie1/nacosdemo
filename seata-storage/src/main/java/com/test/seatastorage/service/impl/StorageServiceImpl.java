package com.test.seatastorage.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.seatastorage.entity.Storage;
import com.test.seatastorage.mapper.StorageMapper;
import com.test.seatastorage.service.StorageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage> implements StorageService {

    @Transactional
    @Override
    public boolean deduct(String commodityCode, int count) {
        UpdateWrapper wrapper = new UpdateWrapper<Storage>();
        wrapper.setSql("count=count-" + count);
        wrapper.eq("commodity_code", commodityCode);
        boolean flag = this.update(wrapper);
        return flag;
    }

}

package com.liusir.mcms.goods.service.impl;

import com.liusir.mcms.goods.dao.GoodsItemRepo;
import com.liusir.mcms.goods.entity.GoodsItem;
import com.liusir.mcms.goods.service.GoodsItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018-12-6.
 */
@Service
public class GoodsItemServiceImpl implements GoodsItemService {

    @Autowired
    GoodsItemRepo repo;

    @Override
    public GoodsItem selectOne(Long id) {
        return null;
    }

    @Override
    public List<GoodsItem> selectList() {
        return null;
    }

    @Override
    public Boolean insert(GoodsItem goodsItem) {

        goodsItem.setCreateDateTime(new Date());
        repo.save(goodsItem);
        return true;
    }

    @Override
    public void update(GoodsItem goodsItem) {

    }

    @Override
    public void update(Long id) {

    }

    @Override
    public void delete(GoodsItem goodsItem) {

    }

    @Override
    public void delete(Long id) {

    }
}

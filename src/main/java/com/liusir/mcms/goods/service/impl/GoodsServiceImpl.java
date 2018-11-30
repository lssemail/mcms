package com.liusir.mcms.goods.service.impl;

import com.liusir.mcms.goods.dao.GoodsRepo;
import com.liusir.mcms.goods.entity.GoodsEntity;
import com.liusir.mcms.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by Administrator on 2018-11-30.
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsRepo goodsRepo;

    @Override
    public GoodsEntity selectOne(Long id) {
        return goodsRepo.getOne(id);
    }

    @Override
    public List<GoodsEntity> selectList() {
        return goodsRepo.findAll();
    }

    @Override
    public Boolean insert(GoodsEntity goodsEntity) {

        goodsRepo.save(goodsEntity);
        return true;
    }

    @Override
    public void update(GoodsEntity goodsEntity) {

    }

    @Override
    public void update(Long id) {

    }

    @Override
    public void delete(GoodsEntity goodsEntity) {
        goodsRepo.delete(goodsEntity);
    }

    @Override
    public void delete(Long id) {
        goodsRepo.deleteById(id);
    }
}

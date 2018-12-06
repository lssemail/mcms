package com.liusir.mcms.porder.service.impl;

import com.liusir.mcms.goods.dao.GoodsItemRepo;
import com.liusir.mcms.goods.entity.GoodsItem;
import com.liusir.mcms.porder.dao.PorderItemRepo;
import com.liusir.mcms.porder.dao.PorderRepo;
import com.liusir.mcms.porder.entity.Porder;
import com.liusir.mcms.porder.entity.PorderItem;
import com.liusir.mcms.porder.service.PorderItemService;
import com.liusir.mcms.porder.service.PorderService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018-12-6.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PorderItemServiceImpl implements PorderItemService {

    Logger logger = LoggerFactory.getLogger(PorderItemServiceImpl.class);

    @Autowired
    PorderItemRepo repo;

    @Autowired
    GoodsItemRepo itemRepo;

    @Autowired
    PorderRepo porderRepo;

    @Override
    public PorderItem selectOne(Long id) {
        return null;
    }

    @Override
    public List<PorderItem> selectList() {
        return null;
    }

    private void init(PorderItem porderItem){

        Long gid = porderItem.getGid();
        GoodsItem goodsItem = itemRepo.getOne(gid);

        porderItem.setName(goodsItem.getName());
        porderItem.setPrice(goodsItem.getJinjia());
        porderItem.setTotal0(porderItem.getPrice() * porderItem.getNumber());
        porderItem.setCreateDateTime(new Date());

    }

    private void updatePorder(Long id, Double total){

        Porder porder = porderRepo.getOne(id);
        porder.setTotal0(porder.getTotal0() + total);
        porderRepo.save(porder);
    }

    @Override
    public Boolean insert(PorderItem item) {

        init(item);
        repo.save(item);
        updatePorder(item.getPid(),item.getTotal0());
        return true;
    }

    @Override
    public void update(PorderItem porderItem) {

    }

    @Override
    public void update(Long id) {

    }

    @Override
    public void delete(PorderItem porderItem) {

    }

    @Override
    public void delete(Long id) {

    }
}

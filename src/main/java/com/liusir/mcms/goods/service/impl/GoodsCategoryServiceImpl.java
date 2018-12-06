package com.liusir.mcms.goods.service.impl;

import com.liusir.mcms.base.ext.dtree.DTree;
import com.liusir.mcms.goods.dao.GoodsCategoryRepo;
import com.liusir.mcms.goods.entity.GoodsCategory;
import com.liusir.mcms.goods.service.GoodsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.rowset.CachedRowSet;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2018-12-6.
 */
@Service
public class GoodsCategoryServiceImpl implements GoodsCategoryService {

    @Autowired
    GoodsCategoryRepo repo;

    @Override
    public List<DTree> categoryList(Long pid) {

        List<GoodsCategory> list = repo.findByPidOrderByPositionAsc(pid);
        List<DTree> dTrees = list.stream().map(item ->{

            DTree dTree = new DTree();
            dTree.setId(item.getId().toString());
            dTree.setParentId(item.getPid().toString());
            dTree.setLast(item.getLast());
            dTree.setTitle(item.getName());
            dTree.setLevel(item.getLevel().toString());
            return dTree;
        }).collect(Collectors.toList());

        return dTrees;
    }

    @Override
    public GoodsCategory selectOne(Long id) {
        return null;
    }

    @Override
    public List<GoodsCategory> selectList() {
        return null;
    }

    @Override
    public Boolean insert(GoodsCategory goodsCategory) {

        goodsCategory.setCreateDateTime(new Date());
        repo.save(goodsCategory);
        return true;
    }

    @Override
    public void update(GoodsCategory goodsCategory) {

    }

    @Override
    public void update(Long id) {

    }

    @Override
    public void delete(GoodsCategory goodsCategory) {

    }

    @Override
    public void delete(Long id) {

    }
}

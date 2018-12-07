package com.liusir.mcms.goods.service;

import com.liusir.mcms.base.ext.dtree.DTree;
import com.liusir.mcms.base.service.BaseService;
import com.liusir.mcms.goods.entity.GoodsCategory;
import com.liusir.mcms.goods.query.GoodsCategoryQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

/**
 * Created by Administrator on 2018-12-6.
 */
public interface GoodsCategoryService extends BaseService<GoodsCategory> {

    List<DTree> categoryList(Long pid);

    Page<GoodsCategory> findAll(Pageable pageable);

    Page<GoodsCategory> findAll(Pageable pageable, GoodsCategoryQuery query);
}

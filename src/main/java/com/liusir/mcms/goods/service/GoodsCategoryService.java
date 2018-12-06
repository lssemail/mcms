package com.liusir.mcms.goods.service;

import com.liusir.mcms.base.ext.dtree.DTree;
import com.liusir.mcms.base.service.BaseService;
import com.liusir.mcms.goods.entity.GoodsCategory;

import java.util.List;

/**
 * Created by Administrator on 2018-12-6.
 */
public interface GoodsCategoryService extends BaseService<GoodsCategory> {

    List<DTree> categoryList(Long pid);
}

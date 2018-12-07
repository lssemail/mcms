package com.liusir.mcms.goods.controller;

import com.liusir.mcms.base.bean.ResultBean;
import com.liusir.mcms.base.ext.dtree.DTree;
import com.liusir.mcms.base.ext.dtree.DTreeResponse;
import com.liusir.mcms.base.ext.dtree.Status;
import com.liusir.mcms.goods.entity.GoodsCategory;
import com.liusir.mcms.goods.entity.GoodsEntity;
import com.liusir.mcms.goods.query.GoodsCategoryQuery;
import com.liusir.mcms.goods.service.GoodsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2018-12-4.
 */
@Controller
@RequestMapping("/goodsCategoryController")
public class GoodsCategoryController {

    @Autowired
    GoodsCategoryService service;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public ResultBean<Boolean> insert(@RequestBody GoodsCategory entity){

        return new ResultBean<>(service.insert(entity));
    }

    @RequestMapping(value = "/categoryList", method = RequestMethod.GET)
    @ResponseBody
    public DTreeResponse categoryList(@RequestParam(defaultValue = "0") String nodeId){

        List<DTree> list = service.categoryList(Long.valueOf(nodeId));
        DTreeResponse response = new DTreeResponse();
        Status status = new Status();
        response.setData(list);
        response.setStatus(status);
        return response;
    }


    @RequestMapping(value = "/page", method = RequestMethod.GET)
    @ResponseBody
    public ResultBean<Page<GoodsCategory>> page(int page, int size, GoodsCategoryQuery query){

        page = page < 0 ? 0 : page;
        size = size < 0 ? 10 : size;
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.ASC, "position");
        return new ResultBean<>(service.findAll(pageable, query));
    }
}

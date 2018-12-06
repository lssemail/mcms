package com.liusir.mcms.goods.controller;

import com.alibaba.fastjson.JSONObject;
import com.liusir.mcms.base.bean.ResultBean;
import com.liusir.mcms.goods.entity.GoodsEntity;
import com.liusir.mcms.goods.entity.GoodsItem;
import com.liusir.mcms.goods.service.GoodsItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018-11-28.
 */
@Controller
@RequestMapping("/goodItemController")
public class GoodItemController {

    @Autowired
    GoodsItemService service;

    @RequestMapping("/insert")
    @ResponseBody
    public ResultBean<Boolean> insert(@RequestBody GoodsItem goodsItem){

        return new ResultBean<>(service.insert(goodsItem));
    }

    @RequestMapping("/test")
    @ResponseBody
    public JSONObject test(@RequestBody GoodsEntity goodsEntity){

        JSONObject obj = new JSONObject();

        obj.put("name", "name");
        obj.put("size", 2);
        return obj;
    }


}

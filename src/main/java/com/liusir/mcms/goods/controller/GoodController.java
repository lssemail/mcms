package com.liusir.mcms.goods.controller;

import com.alibaba.fastjson.JSONObject;
import com.liusir.mcms.base.bean.ResultBean;
import com.liusir.mcms.goods.entity.GoodsEntity;
import com.liusir.mcms.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2018-11-28.
 */
@Controller
@RequestMapping("/goods")
public class GoodController {

    @Autowired
    GoodsService goodsService;

    @RequestMapping("/index")
    @ResponseBody
    public ResultBean<List<GoodsEntity>> index(){

        return new ResultBean<>(goodsService.selectList());
    }

    @RequestMapping("/add")
    @ResponseBody
    public ResultBean<Boolean> add(@RequestBody GoodsEntity goodsEntity){

        return new ResultBean<>(goodsService.insert(goodsEntity));
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

package com.liusir.mcms.goods.controller;

import com.liusir.mcms.base.bean.ResultBean;
import com.liusir.mcms.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public ResultBean<Boolean> index(){

        return new ResultBean<>(goodsService.get());
    }
}

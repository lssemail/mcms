package com.liusir.mcms.base.controller;

import com.liusir.mcms.goods.entity.GoodsEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2018-11-28.
 */
@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/index")
    public ModelAndView index(Model model){
        GoodsEntity goodsEntity = new GoodsEntity();
        goodsEntity.setName("computer");
        goodsEntity.setTags("mac");
        goodsEntity.setUnit("台");
        model.addAttribute("goods", goodsEntity);
        model.addAttribute("title", "index");

        return new ModelAndView("index", "data", model);
    }
}

package com.liusir.mcms.base.controller;

import com.liusir.mcms.goods.entity.GoodsEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("/main")
    public ModelAndView main(Model model){

        return new ModelAndView("page/main", "data", model);
    }


    @RequestMapping("/{p}/{page}")
    public ModelAndView page(@PathVariable String p, @PathVariable String page, Model model){

        return new ModelAndView("page/" + p + "/" + page, "data", model);
    }

    @RequestMapping("/main2")
    public ModelAndView main2(Model model){

        return new ModelAndView("page/main2", "data", model);
    }

    @RequestMapping("/iframeContent")
    public ModelAndView iframeContent(Model model){

        return new ModelAndView("page/iframeContent", "data", model);
    }
}

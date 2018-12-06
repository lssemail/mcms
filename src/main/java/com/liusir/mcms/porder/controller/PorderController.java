package com.liusir.mcms.porder.controller;

import com.liusir.mcms.base.bean.ResultBean;
import com.liusir.mcms.base.ext.dtree.DTree;
import com.liusir.mcms.base.ext.dtree.DTreeResponse;
import com.liusir.mcms.base.ext.dtree.Status;
import com.liusir.mcms.goods.entity.GoodsCategory;
import com.liusir.mcms.goods.service.GoodsCategoryService;
import com.liusir.mcms.porder.entity.Porder;
import com.liusir.mcms.porder.service.PorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2018-12-6.
 */
@Controller
@RequestMapping("porderController")
public class PorderController {

    @Autowired
    PorderService service;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public ResultBean<Boolean> insert(@RequestBody Porder entity){

        return new ResultBean<>(service.insert(entity));
    }

}

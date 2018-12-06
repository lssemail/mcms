package com.liusir.mcms.porder.controller;

import com.liusir.mcms.base.bean.ResultBean;
import com.liusir.mcms.porder.entity.Porder;
import com.liusir.mcms.porder.entity.PorderItem;
import com.liusir.mcms.porder.service.PorderItemService;
import com.liusir.mcms.porder.service.PorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018-12-6.
 */
@Controller
@RequestMapping("porderItemController")
public class PorderItemController {

    @Autowired
    PorderItemService service;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public ResultBean<Boolean> insert(@RequestBody PorderItem entity){

        return new ResultBean<>(service.insert(entity));
    }

}

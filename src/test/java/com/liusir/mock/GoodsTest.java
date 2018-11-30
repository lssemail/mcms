package com.liusir.mock;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.liusir.mcms.goods.entity.GoodsEntity;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import java.util.Date;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/**
 * Created by Administrator on 2018-11-30.
 */
public class GoodsTest extends AbstractMock {

    @Test
    public void add() throws Exception{

        GoodsEntity goodsEntity = new GoodsEntity();
        goodsEntity.setName("苹果电脑");
        goodsEntity.setUnit("台");
        goodsEntity.setTags("电脑");
        goodsEntity.setCreateDateTime(new Date());
        goodsEntity.setUpdateDateTime(new Date());

        ObjectMapper mapper = new ObjectMapper();

        MvcResult mvcResult = mvc.perform(post("/goods/add")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(mapper.writeValueAsString(goodsEntity)))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();


        System.out.println(mvcResult.getResponse().getStatus());
        System.out.println(mvcResult.getResponse().getContentAsString());


    }

}

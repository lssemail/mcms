package com.liusir.mock;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.liusir.mcms.goods.entity.GoodsCategory;
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
public class GoodsCategoryTest extends AbstractMock {

    @Test
    public void insert() throws Exception{

        GoodsCategory category = new GoodsCategory();
            category.setLevel(1);
            category.setName("芙蓉王");
            category.setPid(1L);
            category.setPosition(0);
            category.setState(0);
        ObjectMapper mapper = new ObjectMapper();

        MvcResult mvcResult = mvc.perform(post("/goodsCategoryController/insert")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(mapper.writeValueAsString(category)))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();


        System.out.println(mvcResult.getResponse().getStatus());
        System.out.println(mvcResult.getResponse().getContentAsString());


    }

}

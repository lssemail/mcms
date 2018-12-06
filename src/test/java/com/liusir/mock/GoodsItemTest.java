package com.liusir.mock;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.liusir.mcms.goods.entity.GoodsEntity;
import com.liusir.mcms.goods.entity.GoodsItem;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import java.util.Date;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/**
 * Created by Administrator on 2018-11-30.
 */
public class GoodsItemTest extends AbstractMock {

    @Test
    public void insert() throws Exception{

        GoodsItem item = new GoodsItem();
            item.setCid(1L);
            item.setPid(2L);
            item.setJinjia(12.3D);
            item.setLinshoujia(15D);
            item.setPifajia(14D);
            item.setName("软猴王");
            item.setUnit("条");
            item.setKeyWord("烟,条，猴王");


        ObjectMapper mapper = new ObjectMapper();

        MvcResult mvcResult = mvc.perform(post("/goodItemController/insert")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(mapper.writeValueAsString(item)))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();


        System.out.println(mvcResult.getResponse().getStatus());
        System.out.println(mvcResult.getResponse().getContentAsString());


    }

}

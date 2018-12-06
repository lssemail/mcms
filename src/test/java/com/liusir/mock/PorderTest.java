package com.liusir.mock;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.liusir.mcms.goods.entity.GoodsEntity;
import com.liusir.mcms.porder.entity.Porder;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import java.util.Date;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/**
 * Created by Administrator on 2018-11-30.
 */
public class PorderTest extends AbstractMock {

    @Test
    public void insert() throws Exception{

        Porder porder = new Porder();
        ObjectMapper mapper = new ObjectMapper();

        MvcResult mvcResult = mvc.perform(post("/porderController/insert")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(mapper.writeValueAsString(porder)))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();


        System.out.println(mvcResult.getResponse().getStatus());
        System.out.println(mvcResult.getResponse().getContentAsString());


    }

}

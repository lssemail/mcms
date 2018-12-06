package com.liusir.mock;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.liusir.mcms.porder.entity.Porder;
import com.liusir.mcms.porder.entity.PorderItem;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/**
 * Created by Administrator on 2018-11-30.
 */
public class PorderItemTest extends AbstractMock {

    @Test
    public void insert() throws Exception{

        PorderItem item = new PorderItem();

        item.setPid(1L);
        item.setGid(1L);
        item.setNumber(2.0D);
        ObjectMapper mapper = new ObjectMapper();

        MvcResult mvcResult = mvc.perform(post("/porderItemController/insert")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(mapper.writeValueAsString(item)))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();


        System.out.println(mvcResult.getResponse().getStatus());
        System.out.println(mvcResult.getResponse().getContentAsString());


    }

}

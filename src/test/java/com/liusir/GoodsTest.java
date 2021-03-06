package com.liusir;

import com.liusir.mcms.goods.dao.GoodsCategoryRepo;
import com.liusir.mcms.goods.dao.GoodsItemRepo;
import com.liusir.mcms.goods.dao.GoodsRepo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2018-11-28.
 */
public class GoodsTest extends AbstractSpringTest {

    @Autowired
    GoodsRepo goodsRepo;

    @Autowired
    GoodsItemRepo itemRepo;

    @Autowired
    GoodsCategoryRepo categoryRepo;

    @Test
    public void count() {

        long count = goodsRepo.count();
        System.out.println(count);
    }
}

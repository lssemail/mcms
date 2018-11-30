package com.liusir.mcms.goods.dao;

import com.liusir.mcms.goods.entity.GoodsItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018-11-30.
 */
@Repository
public interface GoodsItemRepo extends JpaRepository<GoodsItem, Long> {
}

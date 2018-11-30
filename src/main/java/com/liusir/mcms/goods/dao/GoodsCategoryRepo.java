package com.liusir.mcms.goods.dao;

import com.liusir.mcms.goods.entity.GoodsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018-11-30.
 */
@Repository
public interface GoodsCategoryRepo extends JpaRepository<GoodsEntity, Long> {

}

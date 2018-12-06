package com.liusir.mcms.goods.dao;

import com.liusir.mcms.goods.entity.GoodsCategory;
import com.liusir.mcms.goods.entity.GoodsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018-11-30.
 */
@Repository
public interface GoodsCategoryRepo extends JpaRepository<GoodsCategory, Long> {

    List<GoodsCategory> findByPidOrderByPositionAsc(Long pid);

}

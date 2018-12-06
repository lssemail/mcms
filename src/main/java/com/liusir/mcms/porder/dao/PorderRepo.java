package com.liusir.mcms.porder.dao;

import com.liusir.mcms.porder.entity.Porder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018-12-6.
 */
@Repository
public interface PorderRepo extends JpaRepository<Porder, Long> {
}

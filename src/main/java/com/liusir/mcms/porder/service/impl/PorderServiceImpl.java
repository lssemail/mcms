package com.liusir.mcms.porder.service.impl;

import com.liusir.mcms.porder.dao.PorderRepo;
import com.liusir.mcms.porder.entity.Porder;
import com.liusir.mcms.porder.service.PorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018-12-6.
 */
@Service
public class PorderServiceImpl implements PorderService {

    @Value("${porder.title}")
    private String porderTitle;

    @Autowired
    PorderRepo repo;

    @Override
    public Porder selectOne(Long id) {
        return null;
    }

    @Override
    public List<Porder> selectList() {
        return null;
    }

    private void init(Porder porder){
        porder.setCreateDateTime(new Date());
        porder.setTitle(porderTitle);
        porder.setDone(Boolean.FALSE);
        porder.setTotal0(0D);
        porder.setTotal1(0D);
        porder.setTotal2(0D);
    }

    @Override
    public Boolean insert(Porder porder) {

        init(porder);
        repo.save(porder);
        return true;
    }

    @Override
    public void update(Porder porder) {

    }

    @Override
    public void update(Long id) {

    }

    @Override
    public void delete(Porder porder) {

    }

    @Override
    public void delete(Long id) {

    }
}

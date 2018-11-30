package com.liusir.mcms.base.service;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * Created by Administrator on 2018-11-28.
 */
public interface BaseService<E> {

    E selectOne(Long id);

    List<E> selectList();

    Boolean insert(E e);

    void update(E e);

    void update(Long id);

    void  delete(E e);

    void delete(Long id);
}

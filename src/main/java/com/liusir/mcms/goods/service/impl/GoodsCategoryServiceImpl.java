package com.liusir.mcms.goods.service.impl;

import com.liusir.mcms.base.ext.dtree.DTree;
import com.liusir.mcms.goods.dao.GoodsCategoryRepo;
import com.liusir.mcms.goods.entity.GoodsCategory;
import com.liusir.mcms.goods.query.GoodsCategoryQuery;
import com.liusir.mcms.goods.service.GoodsCategoryService;
import net.bytebuddy.description.type.TypeDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2018-12-6.
 */
@Service
public class GoodsCategoryServiceImpl implements GoodsCategoryService {

    @Autowired
    GoodsCategoryRepo repo;

    @Override
    public Page<GoodsCategory> findAll(Pageable pageable, GoodsCategoryQuery query) {

        Page<GoodsCategory> page = repo.findAll(new Specification<GoodsCategory>() {
            @Override
            public Predicate toPredicate(Root<GoodsCategory> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                List<Predicate> list = new ArrayList<Predicate>();
                if(Objects.nonNull(query.getPid())){
                    list.add(criteriaBuilder.equal(root.get("pid").as(Long.class), query.getPid()));
                }
                if(Objects.nonNull(query.getPosition())){
                    list.add(criteriaBuilder.equal(root.get("position").as(Integer.class), query.getPosition()));
                }
                if(Objects.nonNull(query.getState())){
                    list.add(criteriaBuilder.equal(root.get("author").as(Integer.class), query.getState()));
                }
                Predicate[] p = new Predicate[list.size()];
                return criteriaBuilder.and(list.toArray(p));
            }
        }, pageable);

        return page;
    }

    @Override
    public Page<GoodsCategory> findAll(Pageable pageable) {

        return repo.findAll(pageable);
    }

    @Override
    public List<DTree> categoryList(Long pid) {

        List<GoodsCategory> list = repo.findByPidOrderByPositionAsc(pid);
        List<DTree> dTrees = list.stream().map(item ->{

            DTree dTree = new DTree();
            dTree.setId(item.getId().toString());
            dTree.setParentId(item.getPid().toString());
            dTree.setLast(item.getLast());
            dTree.setTitle(item.getName());
            dTree.setLevel(item.getLevel().toString());
            return dTree;
        }).collect(Collectors.toList());

        return dTrees;
    }

    @Override
    public GoodsCategory selectOne(Long id) {
        return null;
    }

    @Override
    public List<GoodsCategory> selectList() {
        return null;
    }

    @Override
    public Boolean insert(GoodsCategory goodsCategory) {

        goodsCategory.setCreateDateTime(new Date());
        repo.save(goodsCategory);
        return true;
    }

    @Override
    public void update(GoodsCategory goodsCategory) {

    }

    @Override
    public void update(Long id) {

    }

    @Override
    public void delete(GoodsCategory goodsCategory) {

    }

    @Override
    public void delete(Long id) {

    }
}

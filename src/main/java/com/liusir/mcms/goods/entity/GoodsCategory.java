package com.liusir.mcms.goods.entity;

import com.liusir.mcms.base.entity.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 商品分类
 */
@Entity
@Table(name = "t_goods_category")
public class GoodsCategory extends BaseModel {

    @Column
    private String name;
    @Column
    private Integer position;
    @Column
    private Integer state;
    @Column
    private Long pid;
    @Column
    private Integer level;

    private Boolean last;

    public Boolean getLast() {
        return last;
    }

    public void setLast(Boolean last) {
        this.last = last;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}

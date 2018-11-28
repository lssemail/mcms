package com.liusir.mcms.goods.entity;

import com.liusir.mcms.base.entity.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Administrator on 2018-11-27.
 */
@Entity
@Table(name = "t_goods")
public class GoodsEntity extends BaseModel {

    @Column
    private String name;
    @Column
    private String tags;
    @Column
    private String unit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}

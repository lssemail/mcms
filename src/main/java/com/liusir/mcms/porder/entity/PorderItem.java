package com.liusir.mcms.porder.entity;

import com.liusir.mcms.base.entity.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Administrator on 2018-12-6.
 */
@Entity
@Table(name = "t_purchase_order_item")
public class PorderItem extends BaseModel {

    @Column
    private Long pid;

    @Column
    private Long gid;

    @Column
    private String name;

    @Column
    private Double price;

    @Column
    private Double total0;

    @Column
    private Double total1;

    @Column
    private Double number;

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotal0() {
        return total0;
    }

    public void setTotal0(Double total0) {
        this.total0 = total0;
    }

    public Double getTotal1() {
        return total1;
    }

    public void setTotal1(Double total1) {
        this.total1 = total1;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }
}

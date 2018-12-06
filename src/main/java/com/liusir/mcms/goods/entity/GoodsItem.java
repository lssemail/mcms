package com.liusir.mcms.goods.entity;

import com.liusir.mcms.base.entity.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Administrator on 2018-11-30.
 */
@Entity
@Table(name = "t_goods_item")
public class GoodsItem extends BaseModel {

    @Column
    private Long pid;
    @Column
    private String name;
    @Column
    private Long cid;
    @Column
    private String unit;
    /**
     * 进价
     */
    @Column
    private Double jinjia;
    /**
     * 零售价
     */
    @Column
    private Double linshoujia;
    /**
     * 批发价
     */
    @Column
    private Double pifajia;

    @Column
    private String note;

    @Column
    private String tags;

    /**
     * 检索关键字
     */
    @Column
    private String keyWord;

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

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getJinjia() {
        return jinjia;
    }

    public void setJinjia(Double jinjia) {
        this.jinjia = jinjia;
    }

    public Double getLinshoujia() {
        return linshoujia;
    }

    public void setLinshoujia(Double linshoujia) {
        this.linshoujia = linshoujia;
    }

    public Double getPifajia() {
        return pifajia;
    }

    public void setPifajia(Double pifajia) {
        this.pifajia = pifajia;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
}

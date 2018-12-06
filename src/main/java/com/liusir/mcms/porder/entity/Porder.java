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
@Table(name = "t_purchase_order")
public class Porder extends BaseModel {

    @Column
    private String title;
    /**
     * 应付
     */
    @Column
    private Double total0;
    /**
     * 实付
     */
    @Column
    private Double total1;
    /**
     * 优惠
     */
    @Column
    private Double total2;

    /**
     * 说明
     */
    @Column
    private String note;

    /**
     * 完成时间
     */
    @Column
    private Date doneDateTime;

    @Column
    private Boolean done;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Double getTotal2() {
        return total2;
    }

    public void setTotal2(Double total2) {
        this.total2 = total2;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDoneDateTime() {
        return doneDateTime;
    }

    public void setDoneDateTime(Date doneDateTime) {
        this.doneDateTime = doneDateTime;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}

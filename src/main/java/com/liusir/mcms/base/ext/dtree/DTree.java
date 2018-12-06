package com.liusir.mcms.base.ext.dtree;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018-12-3.
 */
public class DTree {

    /** 节点ID*/
    private String id;
    /** 上级节点ID*/
    private String parentId;
    /** 节点名称*/
    private String title;
    /** 层级*/
    private String level;
    /** 是否最后一级节点*/
    private Boolean isLast;
    /** 自定义图标class*/
    private String iconClass;
    /** 表示用户自定义需要存储在树节点中的数据*/
    private Object basicData;
    /** 复选框集合*/
    private List<CheckArr> checkArr = new ArrayList<CheckArr>();
    /** 子节点集合*/
    private List<DTree> children = new ArrayList<DTree>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @JsonProperty(value = "isLast")
    public Boolean isLast() {
        return isLast;
    }

    public void setLast(Boolean last) {
        isLast = last;
    }

    public String getIconClass() {
        return iconClass;
    }

    public void setIconClass(String iconClass) {
        this.iconClass = iconClass;
    }

    public Object getBasicData() {
        return basicData;
    }

    public void setBasicData(Object basicData) {
        this.basicData = basicData;
    }

    public List<CheckArr> getCheckArr() {
        return checkArr;
    }

    public void setCheckArr(List<CheckArr> checkArr) {
        this.checkArr = checkArr;
    }

    public List<DTree> getChildren() {
        return children;
    }

    public void setChildren(List<DTree> children) {
        this.children = children;
    }
}

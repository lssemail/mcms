package com.liusir.mcms.base.ext.dtree;

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
}

package com.liusir.mcms.base.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2018-11-28.
 */
public class ResultBean<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final int SUCCESS = 0;

    public static final int FAIL = 1;

    private String msg = "success";

    private int code = SUCCESS;

    private T data;

    public ResultBean(){
        super();
    }

    public ResultBean(T data){
        super();
        this.data = data;
    }

    public ResultBean(Throwable e){
        super();
        this.msg = e.getMessage();
        this.code = FAIL;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

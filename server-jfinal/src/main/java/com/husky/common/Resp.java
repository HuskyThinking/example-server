package com.husky.common;

import com.jfinal.plugin.activerecord.Record;

public class Resp {

    // 状态 SUCCESS、FAIL
    private String status;
    // 返回码
    private String code;
    // 描述
    private String msg;
    // 返回对象
    private Object obj;

    public Resp(String status, String code, String msg) {
        this.status = status;
        this.code = code;
        this.msg = msg;
    }

    public Resp(String status, String code, String msg, Object obj) {
        this.status = status;
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}

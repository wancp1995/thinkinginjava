package com.example.demo.bean;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONResult {

    private static final ObjectMapper MAPPER = new ObjectMapper();


    private Integer code;
    private String msg;
    private Object data;

    public JSONResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public JSONResult(Object data) {
        this.code = 200;
        this.msg = "OK";
        this.data = data;
    }

    public static JSONResult ok(Object data) {
        return new JSONResult(data);
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

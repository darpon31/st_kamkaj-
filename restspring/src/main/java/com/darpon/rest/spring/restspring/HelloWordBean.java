package com.darpon.rest.spring.restspring;

public class HelloWordBean {

    private String msg;


    public HelloWordBean(String msg) {
        this.msg=msg;

    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

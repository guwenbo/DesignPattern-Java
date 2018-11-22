package com.bobo.patterns.responsibility;

public class Response {

    // 响应的内容
    private String message;

    public Response() {

    }

    // 构造函数方式注入响应的内容
    public Response(String message) {
        this.setMessage(message);
    }

    @Override
    public String toString() {
        return "Response{ message : " + message + '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

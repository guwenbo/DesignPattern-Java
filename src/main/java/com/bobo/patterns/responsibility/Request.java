package com.bobo.patterns.responsibility;

public class Request {

    // 请求的等级
    private Level level;

    // 请求内容
    private String content;

    public Request() {

    }

    public Request(Level level) {
        this.setLevel(level);
    }

    public Request(String content) {
        this.setContent(content);
    }

    // 构造函数方式注入请求等级以及请求内容
    public Request(Level level, String content) {
        this(level);
        this.setContent(content);
    }

    @Override
    public String toString() {
        return "Request{ level : " + level + " , content : " + content + '}';
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}

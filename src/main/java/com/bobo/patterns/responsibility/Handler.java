package com.bobo.patterns.responsibility;

public abstract class Handler {

    // 责任链上的下一个处理者
    private Handler nextHandler;

    // 处理者自身可以处理的请求等级
    private Level handleLevel;

    public Handler() {

    }

    public Handler(Handler handler) {
        this.setNextHandler(handler);
    }

    public Handler(Level level) {
        this.setHandleLevel(level);
    }

    // 构造函数方式注入下一个处理者以及自身可以处理的请求等级
    public Handler(Handler handler, Level level) {
        this(handler);
        this.setHandleLevel(level);
    }

    // 具体处理的业务逻辑
    public abstract Response process(Request request);

    // 判断请求自身能否处理，如果不能，则将请求传递到下一个处理者
    // 模版方法
    public final Response handleRequest(Request request) {

        Response response = null;

        // 判断能否处理请求
        if (getHandleLevel().equals(request.getLevel())) {

            // 具体处理
            response = process(request);

        } else {

            if (getNextHandler() != null) {

                // 传递请求
                response = getNextHandler().handleRequest(request);

            } else {

                System.out.println("Can not handle this request");

            }
        }

        return response;

    }


    public Level getHandleLevel() {
        return handleLevel;
    }

    public void setHandleLevel(Level handleLevel) {
        this.handleLevel = handleLevel;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

}

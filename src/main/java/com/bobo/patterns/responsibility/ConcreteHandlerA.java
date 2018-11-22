package com.bobo.patterns.responsibility;

public class ConcreteHandlerA extends Handler {

    public ConcreteHandlerA() {

    }

    public ConcreteHandlerA(Handler nextHandler) {
        super(nextHandler);
    }

    public ConcreteHandlerA(Level level) {
        super(level);
    }

    public ConcreteHandlerA(Handler nextHandler, Level level) {
        super(nextHandler, level);
    }

    // 具体的处理逻辑
    public Response process(Request request) {

        System.out.println("Concrete Handler A handle the request : " + request.toString());

        return new Response("Request accepted by Concrete Handler A ...");
    }

}

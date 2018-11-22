package com.bobo.patterns.responsibility;

public class ConcreteHandlerB extends Handler {

    public ConcreteHandlerB() {

    }

    public ConcreteHandlerB(Handler nextHandler) {
        super(nextHandler);
    }

    public ConcreteHandlerB(Level level) {
        super(level);
    }

    public ConcreteHandlerB(Handler nextHandler, Level level) {
        super(nextHandler, level);
    }

    // 具体的处理逻辑
    public Response handle(Request request) {

        System.out.println("Concrete Handler B handle the request: " + request.toString());

        return new Response("Request accepted by Concrete Handler B ...");
    }

}

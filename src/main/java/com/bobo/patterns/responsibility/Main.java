package com.bobo.patterns.responsibility;


public class Main {

    public static void main(String[] args) {

        Handler hb = new ConcreteHandlerB(new Level(2));

        Handler ha = new ConcreteHandlerA(hb, new Level(1));

        Request request = new Request(new Level(3), "Request with Level 2 ...");

        Response response = ha.handleRequest(request);

        System.out.println(response);

    }

}

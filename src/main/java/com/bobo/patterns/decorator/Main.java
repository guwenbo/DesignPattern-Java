package com.bobo.patterns.decorator;

public class Main {

    public static void main(String[] args) {

        Component component = new ConcreteComponent();

        Decorator db = new ConcreteDecoratorB(component);

        Decorator da = new ConcreteDecoratorA(db);

        da.operate();

    }

}

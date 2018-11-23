package com.bobo.patterns.decorator;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    private void decorate() {
        System.out.println("Concrete Decorator A decorate operate ...");
    }

    @Override
    public void operate() {
        decorate();
        super.operate();
    }

}

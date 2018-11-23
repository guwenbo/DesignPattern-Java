package com.bobo.patterns.decorator;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    private void decorate() {
        System.out.println("Concrete Decorator B decorate operate ...");
    }

    @Override
    public void operate() {
        super.operate();
        decorate();
    }

}

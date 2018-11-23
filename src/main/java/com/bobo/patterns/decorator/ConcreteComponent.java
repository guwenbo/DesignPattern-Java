package com.bobo.patterns.decorator;

public class ConcreteComponent implements Component {

    @Override
    public void operate() {
        System.out.println("Concrete Component do something ...");
    }

}

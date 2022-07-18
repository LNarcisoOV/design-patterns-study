package com.designpatterns.structural.decorator.christmastree;

public class BubbleLights extends AbstractChristmasTree {

    public BubbleLights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + "+ Bubble Lights ";
    }
}

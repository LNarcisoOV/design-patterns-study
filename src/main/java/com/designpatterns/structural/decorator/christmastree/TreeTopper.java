package com.designpatterns.structural.decorator.christmastree;

public class TreeTopper extends AbstractChristmasTree {

    public TreeTopper(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + "+ tree topper.";
    }
}

package com.designpatterns.structural.decorator.christmastree;

public class AbstractChristmasTree implements ChristmasTree{
    private ChristmasTree christmasTree;

    public AbstractChristmasTree(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        return christmasTree.decorate();
    }

}

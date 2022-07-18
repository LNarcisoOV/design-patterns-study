package com.designpatterns.structural.decorator.christmastree;

public class ChristmasTreeMain {

    public static void main(String... arg) {
        ChristmasTree ct1 = new BubbleLights(new ChristmasTreeImpl());
        System.out.println("The message is Christmas Tree + Bubble Lights:");
        System.out.println(ct1.decorate().equals("Christmas Tree + Bubble Lights "));
        
        ChristmasTree ct2 = new TreeTopper(new ChristmasTreeImpl());
        System.out.println("The message is Christmas Tree + tree topper:");
        System.out.println(ct2.decorate().equals("Christmas Tree + tree topper."));
    }
}

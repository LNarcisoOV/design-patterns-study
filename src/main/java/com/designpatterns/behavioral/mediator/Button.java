package com.designpatterns.behavioral.mediator;

public class Button {
    private Mediator mediator;

    private Button(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        mediator.press();
    }

}

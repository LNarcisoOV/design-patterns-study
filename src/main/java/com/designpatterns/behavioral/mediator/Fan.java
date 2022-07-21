package com.designpatterns.behavioral.mediator;

public class Fan {

    private Mediator mediator;
    private boolean isOn = false;
    
    private Fan(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }

}

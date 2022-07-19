package com.designpatterns.behavioral.command;

public class TextFile {

    private String value;

    public TextFile(String value) {
        this.value = value;
    }

    public String open() {
        return "Open text file: " + value;
    }

    public String save() {
        return "Save text file: " + value;
    }

    @Override
    public String toString() {
        return "TextFile [value=" + value + "]";
    }
}

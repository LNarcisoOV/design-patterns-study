package com.designpatterns.behavioral.command;

public class OpenTextFile implements TextFileAction {

    private TextFile textFile;

    public OpenTextFile(final TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.open();
    }

    @Override
    public String toString() {
        return "OpenTextFile [textFile=" + textFile + "]";
    }
}

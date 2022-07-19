package com.designpatterns.behavioral.command;

public class SaveTextFile implements TextFileAction {

    private TextFile textFile;

    public SaveTextFile(final TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }

    @Override
    public String toString() {
        return "SaveTextFile [textFile=" + textFile + "]";
    }
}

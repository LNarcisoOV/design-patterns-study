package com.designpatterns.behavioral.command;

public class CommandMain {

    public static void main(String[] args) {
        TextFileOperationExecutor executor = new TextFileOperationExecutor();
        executor.executeOperaion(() -> "SaveFile.txt");
        executor.executeOperaion(() -> "OpenFile.txt");
    }
}

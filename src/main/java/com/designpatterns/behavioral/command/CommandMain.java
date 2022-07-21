package com.designpatterns.behavioral.command;

public class CommandMain {

    public static void main(String[] args) {
        TextFileOperationExecutor executor = new TextFileOperationExecutor();
        executor.executeOperaion(new SaveTextFile(new TextFile("SaveFile.txt")));
        executor.executeOperaion(new OpenTextFile(new TextFile("OpenFile.txt")));
        
        executor.getTextFileActions().forEach(System.out::println);;
    }
}

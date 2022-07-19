package com.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {

    private final List<TextFileAction> textFileActions = new ArrayList<>();

    public String executeOperaion(TextFileAction action) {
        textFileActions.add(action);
        return action.execute();
    }
    
    public List<TextFileAction> getTextFileActions() {
        return this.textFileActions;
    }
}

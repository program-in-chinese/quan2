package com.program_in_chinese;

import static com.program_in_chinese.圈2Parser.AddContext;
import static com.program_in_chinese.圈2Parser.AssignContext;
import static com.program_in_chinese.圈2Parser.PrintContext;

import java.util.HashMap;
import java.util.Map;

public class MyListener extends 圈2BaseListener {

    private Map<String, Integer> variables;
    
    public MyListener() {
        variables = new HashMap<>();
    }
    
    @Override
    public void exitAssign(AssignContext ctx) {
        // This method is called when the parser has finished
        // parsing the assign statement
        
        // Get variable name
        String variableName = ctx.ID(0).getText();
        
        // Get value from variable or number
        String value = ctx.ID().size() > 1 ? ctx.ID(1).getText() 
                : ctx.NUMBER().getText();
        
        // Add variable to map      
        if(ctx.ID().size() > 1)
            variables.put(variableName, variables.get(value));
        else
            variables.put(variableName, Integer.parseInt(value));
    }
    
    @Override
    public void exitAdd(AddContext ctx) {
        // This method is called when the parser has finished
        // parsing the add statement
        
        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText() 
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText()) 
                : Integer.parseInt(ctx.NUMBER().getText());
        
        variables.put(variableName, variables.get(variableName) + value);
    }
    
    @Override
    public void exitPrint(PrintContext ctx) {
        // This method is called when the parser has finished
        // parsing the print statement
        
        String output = ctx.ID() == null ? ctx.NUMBER().getText() 
                : variables.get(ctx.ID().getText()).toString();
        System.out.println(output);
    }

}
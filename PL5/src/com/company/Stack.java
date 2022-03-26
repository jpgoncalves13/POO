package com.company;

import java.util.ArrayList;

public class Stack {
    ArrayList<String> stack = new ArrayList();

    public Stack(){
        this.stack = new ArrayList<String>();
    }

    public String top(){
        return (String) this.stack.get(this.stack.size() - 1);
    }

    public void push(String s){
        this.stack.add(s);
    }

    public void pop(){
        this.stack.remove(this.stack.size()-1);
    }

    public boolean empty(){
        boolean res = this.stack.size() == 0;
        return res;
    }

    public int length(){
        return this.stack.size();
    }
}

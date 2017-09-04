package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int add(){
        return a+b;
    }

    public int substract(){
        return a-b;
    }

    public int getIntA(){
        return a;
    }

    public int getIntB(){
        return b;
    }
}

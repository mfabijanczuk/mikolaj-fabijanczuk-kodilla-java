package com.kodilla.stream.lambda;

public class ExpressionExecutor {
    public void executeExpression(double a, double b, MathMexpression mathMexpression){
        double result = mathMexpression.calcuateExpression(a,b);
        System.out.println("Result equals: " + result);
    }
}

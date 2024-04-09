package com.learning.core.day4session1.D03P09;

import java.util.Stack;

public class ExpressionEvaluator3 {
    public static void main(String[] args) {
        String expression = "10 plus 2 into 6";
        double result = evaluateExpression(expression);
        System.out.println("Output: " + result);
    }

    public static double evaluateExpression(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else if (token.equals("plus")) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                stack.push(operand1 + operand2);
            } else if (token.equals("into")) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                stack.push(operand1 * operand2);
            }
        }
        
        return stack.pop();
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
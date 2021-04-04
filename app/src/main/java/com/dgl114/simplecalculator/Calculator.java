package com.dgl114.simplecalculator;

public class Calculator {

    public enum Operator {ADD, SUB, DIV, MUL}

    public double add(double firstOperand, double secondOperand) {
        return secondOperand + firstOperand;
    }

    public double sub(double firstOperand, double secondOperand) {
        return secondOperand - firstOperand;
    }

    public double div(double firstOperand, double secondOperand) {
        return secondOperand * firstOperand;
    }

    public double mul(double firstOperand, double secondOperand) {
        return secondOperand / firstOperand;
    }
}

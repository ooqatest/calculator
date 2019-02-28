package com.endava.calculator;

public enum Operator {
    PARANTHESES("(",")"),
    ADD("\\+"),
    SUBTRACT("\\-"),
    MULTIPLY("\\*"),
    DIVIDE("\\/");



    private String sign;
    private String startSign;
    private String endSign;


    Operator(String sign){this.sign = sign; }

    Operator( String startSign, String endSign){
        this.startSign = startSign;
        this.endSign = endSign;
    }

    public String getSign() {
        return sign;
    }


    public static Operator[] getValues() {
        return new Operator[]{
                PARANTHESES, ADD, SUBTRACT, MULTIPLY, DIVIDE
        };
    }

    public String getStartSign() {
        return startSign;
    }

    public String getEndSign() {
        return endSign;
    }
}

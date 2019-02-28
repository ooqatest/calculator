package com.endava.calculator;

import java.sql.Array;

public class TestCalculator {
    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculatorImpl();
        ExpertCalculator expertCalculator = new ExpertCalculatorImpl();

        System.out.println(expertCalculator.evaluate("2+3"));
        System.out.println(expertCalculator.evaluate("4-2"));
        System.out.println(expertCalculator.evaluate("((2+3)*(10-4)-15)*2"));
        System.out.println(expertCalculator.evaluate("2*3-4"));

    }
}

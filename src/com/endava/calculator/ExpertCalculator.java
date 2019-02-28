package com.endava.calculator;

public interface ExpertCalculator {

    Long pow(Integer x, Integer n);

    Double root(Integer x, Integer n);

    Long factorial(Integer n);

    Double evaluate(String expression);
}

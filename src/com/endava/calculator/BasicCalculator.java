package com.endava.calculator;

public interface BasicCalculator {
    Long add(Integer... array);
    Long add(Long a, Long b);
    Double add(Double a,Double b);
    Double multiply(Double a, Double b);
    Integer multiply(Integer a, Integer b);
    Double subtract(Double a,Double b);
    Double divide(Double a,Double b);
}

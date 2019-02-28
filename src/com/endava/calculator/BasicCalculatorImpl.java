package com.endava.calculator;

public class BasicCalculatorImpl implements BasicCalculator{

    @Override
    public Long add(Integer... array) {
        Long sum = 0L;
        for(Integer number : array){
            sum+=number;
        }
        return sum;
    }
    @Override
    public Double subtract(Double a, Double b){
        return a-b;
    }

    @Override
    public Long add(Long a, Long b) {
        return a+b;
    }

    @Override
    public Double add(Double a, Double b) {
        return a+b;
    }
    @Override
    public Double divide(Double a,Double b ){
        return a/b;
    }
    @Override
    public Integer multiply(Integer a, Integer b) {
        return a*b;
    }

    @Override
    public Double multiply(Double a, Double b) {
        return a*b;
    }
}

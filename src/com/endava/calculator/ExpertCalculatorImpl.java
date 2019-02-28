package com.endava.calculator;

public class ExpertCalculatorImpl extends BasicCalculatorImpl implements ExpertCalculator {

    @Override
    public Long add(Long a, Long b) {
        return null;
    }

    @Override
    public Double add(Double a, Double b) {

        return a + b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return null;
    }

    @Override
    public Long pow(Integer x, Integer n) {
        return null;
    }

    @Override
    public Double root(Integer x, Integer n) {
        return null;
    }

    @Override
    public Double subtract(Double a, Double b) {
        return a - b;
    }
    @Override
    public Double divide(Double a, Double b) {
        return a / b;
    }
    @Override
    public Double multiply(Double a, Double b) {
        return a * b;
    }

    @Override
    public Long factorial(Integer n) {
        if (n == 0) {
            return 1L;
        } else {
            return n * factorial(n - 1);
        }
    }

    @Override
    public Double evaluate(String expression) {
        Double result = null;
        operatorIterator:
        for (Operator operator : Operator.getValues()) {

            switch (operator) {
                case ADD: {
                    result = evaluateArithmeticSign(expression,operator);
                    break;
                }
                case SUBTRACT: {
                    result = evaluateArithmeticSign(expression,operator);
                    break;
                }
                case MULTIPLY:{
                    result = evaluateArithmeticSign(expression,operator);
                    break;
                }
                case DIVIDE:{
                    result = evaluateArithmeticSign(expression,operator);
                    break;
                }
                case PARANTHESES:
                    String resultExpression = evaluateMultipleSign(expression,operator);
                    if ( resultExpression!= null) {
                        result = evaluate(resultExpression);
                    }
                    break;
            }
            if( result == null ){
                continue ;
            }
            else{
                break operatorIterator;
            }

        }
        if (result == null){
            return Double.valueOf(expression);
        }
        return result;
    }

    private String evaluateMultipleSign(String expression, Operator operator) {
        int startIndex = expression.indexOf(operator.getStartSign());
        int endIndex = expression.lastIndexOf(operator.getEndSign());

        if(startIndex == -1){

            return null;
        }
        String newExpression = expression.substring(startIndex+1,endIndex);
        Double result = evaluate(newExpression);
        return expression.substring(0, startIndex) + result + expression.substring(endIndex + 1);
    }

    private Double evaluateArithmeticSign(String expression , Operator operator){

        String[] operands = expression.split(operator.getSign(), 2);
        if (operands.length == 1) {
            return null;
        }

        Double leftOperand = evaluate(operands[0]);
        Double rightOperand = evaluate(operands[1]);

        switch (operator){
            case ADD: return add(leftOperand,rightOperand);
            case SUBTRACT: return subtract(leftOperand,rightOperand);
            case DIVIDE: return divide(leftOperand, rightOperand);
            case MULTIPLY: return multiply(leftOperand,rightOperand);
            default: throw new RuntimeException("Method should be used only for signs");
        }

    }

}

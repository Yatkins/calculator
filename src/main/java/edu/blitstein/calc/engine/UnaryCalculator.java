package edu.blitstein.calc.engine;

import edu.blitstein.calc.engine.op.UnaryOperation;
import edu.blitstein.calc.engine.op.UnaryOperationFactory;
import edu.blitstein.calc.exception.DivideByZeroException;
import edu.blitstein.calc.exception.UnknownOpException;

public class UnaryCalculator {
    private double results;

    public UnaryCalculator(){
        this.results = 0.0;
    }
    public UnaryCalculator(double initialValue){
        results = initialValue;
    }
    public void reset(){
        results = 0;
    }
    public void setResult(double newResults){
        results = newResults;
    }
    public double getResult(){
        return results;
    }

    public double evaluate(String opString, double n1)
            throws DivideByZeroException, UnknownOpException {
        double answer;
        UnaryOperation op = UnaryOperationFactory.getOperation(opString);
        answer = op.apply(n1);
        return answer;
    }
}

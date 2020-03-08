package edu.blitstein.calc.engine.op;

import edu.blitstein.calc.exception.DivideByZeroException;

public enum UnaryOperation {
    ABS("absoluteValue"){
        public double apply(double x){
            if(x<0){
                 x = x*-1.0;
            } return x;
        }
    }, INVERT("inverse"){
        public double apply(double x) {
            double precision = 0.001;
            if ((-precision < x) && (x < precision)) {
                throw new DivideByZeroException();
            }
            return 1.0 / x;
        }
    };

    private String op;
    UnaryOperation(String op) {
        this.op = op;
    }

    @Override
    public String toString(){
        return op;
    }

    public abstract double apply(double x) throws ArithmeticException;
}
package edu.blitstein.calc.engine.op;

import edu.blitstein.calc.exception.UnknownOpException;

public class UnaryOperationFactory {

    public static UnaryOperation getOperation(String opString) throws UnknownOpException {
        UnaryOperation op = null;
        switch(opString){
            case "absoluteValue":
                op = UnaryOperation.ABS;
                break;
            case "invert":
                op = UnaryOperation.INVERT;
                break;
            default: throw new UnknownOpException(opString);
        }
       return op;
    }
}

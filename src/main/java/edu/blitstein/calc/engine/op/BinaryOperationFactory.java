package edu.blitstein.calc.engine.op;

import edu.blitstein.calc.exception.UnknownOpException;

public class BinaryOperationFactory {

    public static BinaryOperation getOperation(char opChar) throws UnknownOpException {
        BinaryOperation op = null;
        switch (opChar) {
            case '+':
                op = BinaryOperation.PLUS;
                break;
            case '-':
                op = BinaryOperation.MINUS;
                break;
            case '*':
                op = BinaryOperation.TIMES;
                break;
            case '/':
                op = BinaryOperation.DIVIDE;
                break;
            case '@':
                op = BinaryOperation.OFF;
                break;
            default:
                throw new UnknownOpException(opChar);
        }
        return op;
    }
}
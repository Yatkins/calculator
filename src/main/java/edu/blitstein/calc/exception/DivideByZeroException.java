package edu.blitstein.calc.exception;

public class DivideByZeroException extends ArithmeticException {
    public DivideByZeroException() {
        super("Dividing by Zero!");
    }

    public DivideByZeroException(String message) {
        super(message);
    }
}

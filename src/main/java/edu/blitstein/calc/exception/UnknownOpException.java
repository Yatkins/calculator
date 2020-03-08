package edu.blitstein.calc.exception;

public class UnknownOpException extends Exception {

        public UnknownOpException(){

        }

        public UnknownOpException(String string){
            super(string);
        }

        public UnknownOpException(char op){
            super(op + "is an unknown operator.");
        }
}

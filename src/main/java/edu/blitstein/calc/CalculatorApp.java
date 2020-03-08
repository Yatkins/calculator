package edu.blitstein.calc;

import edu.blitstein.calc.engine.Calculator;
import edu.blitstein.calc.exception.DivideByZeroException;
import edu.blitstein.calc.exception.UnknownOpException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args)
            throws DivideByZeroException, UnknownOpException {
        System.out.println("Calculator is on.");
        System.out.print("Format of each line: ");
        System.out.println("operator space number");
        System.out.println("For example: + 3");
        System.out.println("To end, enter the letter e.");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter initial value: ");
        double initialValue = keyboard.nextDouble();

        Calculator clerk = new Calculator(initialValue);
        System.out.println("Starting with = " + clerk.getResult());
        boolean done = false;
        double result = initialValue;
        while (!done) {
            char nextOp = (keyboard.next()).charAt(0);
            if ((nextOp == 'e') || (nextOp == 'E'))
                done = true;
            else {
                try{
                double nextNumber = keyboard.nextDouble();
                result = clerk.evaluate(nextOp, result, nextNumber);
                //result isn't changing
                System.out.println(clerk.getResult());
                System.out.println("result " + nextOp + " " + nextNumber + " = " + result);
                System.out.println("updated result = " + result);
                 }catch(DivideByZeroException e){
                    System.out.println(e.getMessage());
                }catch(UnknownOpException e){
                    System.out.println(e.getMessage());
                }catch(NumberFormatException e){
                    System.out.println(e.getMessage());
                }catch(InputMismatchException e){
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("The final result is " + clerk.getResult());
        System.out.println("Calculator program ending.");
    }
}
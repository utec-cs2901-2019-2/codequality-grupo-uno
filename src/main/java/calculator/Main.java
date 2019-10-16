package calculator;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        float firstOperator = 0;
        float secondOperator = 0;
        char operator=' ';
        String input = sc.next();
        String [] parser = input.split("[+-/*]");
        firstOperator = Integer.parseInt(parser[0]);
        secondOperator = Integer.parseInt(parser[1]);
        int addition = input.indexOf('+');
        int substraction = input.indexOf('-');
        int multiplication = input.indexOf('*');
        int division = input.indexOf('/');
        if(addition >= 0){
            operator='+';
        }
        if(substraction >= 0){
            operator='-';
        }
        if(multiplication >= 0){
            operator='*';
        }
        if(division >= 0){
            operator='/';
        }

        // Scanning operands into variables
        if (operator == '/' && secondOperator == 0) {
            throw new IllegalArgumentException("Divisor can't be zero");
        }
        else {
            Calculator calc = new Calculator(firstOperator, secondOperator);
            if(operator == '+' ) {
                calc.sum();
                String result = Float.toString(calc.adition.operate());
                LOGGER.log(Level.INFO, result);
            }
            if(operator == '-') {
                calc.substract();
                String result = Float.toString(calc.substraction.operate());
                LOGGER.log(Level.INFO, result);
            }

            if(operator == '*') {
                calc.multiply();
                String result = Float.toString(calc.multiplication.operate());
                LOGGER.log(Level.INFO, result);
            }

            if (operator == '/') {
                calc.divide();
                String result = Float.toString(calc.division.operate());
                LOGGER.log(Level.INFO, result);
            }
        }
    }
}

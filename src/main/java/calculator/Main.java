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
        String [] arrof = input.split("[+-/*]");
        firstOperator = Integer.parseInt(arrof[0]);
        secondOperator = Integer.parseInt(arrof[1]);
        int plus = input.indexOf('+');
        int minus = input.indexOf('-');
        int mul = input.indexOf('*');
        int div = input.indexOf('/');
        if(plus >= 0){
            operator='+';
        }
        if(minus >= 0){
            operator='-';
        }
        if(mul >= 0){
            operator='*';
        }
        if(div >= 0){
            operator='/';
        }

        // Scanning operands into variables
        if (operator == '/' && secondOperator == 0) {
            throw new IllegalArgumentException("Divisor can't be zero");
        }
        else {
            Calculator calc = new Calculator(firstOperator, secondOperator);
            if(operator == '+' ) {
                calc.Sum();
                String result = Float.toString(calc.adition.operate());
                LOGGER.log(Level.INFO, result);
            }
            if(operator == '-') {
                calc.Substract();
                String result = Float.toString(calc.substraction.operate());
                LOGGER.log(Level.INFO, result);
            }

            if(operator == '*') {
                calc.Multiply();
                String result = Float.toString(calc.multiplication.operate());
                LOGGER.log(Level.INFO, result);
            }

            if (operator == '/') {
                calc.Divide();
                String result = Float.toString(calc.division.operate());
                LOGGER.log(Level.INFO, result);
            }
        }
    }
}

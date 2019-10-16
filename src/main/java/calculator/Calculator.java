package calculator;

public class Calculator {

    float firstOperand;
    float secondOperand;
    Substraction substraction;
    Adition adition;
    Multiplication multiplication;
    Division division;

    Calculator(float firstOperand, float secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    void sum(){
        adition = new Adition(firstOperand, secondOperand);
    }
    void substract(){
        substraction = new Substraction(firstOperand, secondOperand);
    }
    void multiply() {
        multiplication = new Multiplication(firstOperand, secondOperand);
    }
    void divide() {
        division = new Division(firstOperand, secondOperand);
    }
}

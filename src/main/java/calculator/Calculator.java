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

    void Sum(){
        adition = new Adition(firstOperand, secondOperand);
    }
    void Substract(){
        substraction = new Substraction(firstOperand, secondOperand);
    }
    void Multiply() {
        multiplication = new Multiplication(firstOperand, secondOperand);
    }
    void Divide() {
        division = new Division(firstOperand, secondOperand);
    }
}

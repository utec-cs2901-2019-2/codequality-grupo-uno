package calculator;

public class Adition extends Operation {
    public Adition(float firstNumber, float secondNumber) {
        firstOperand = firstNumber;
        secondOperand = secondNumber;
    }

    public float operate() {
        return firstOperand+secondOperand;
    }
}

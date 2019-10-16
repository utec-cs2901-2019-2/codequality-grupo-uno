package calculator;

public class Substraction extends Operation {
    public Substraction(float firstOperand, float secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }
    public float operate() {
        return firstOperand - secondOperand;
    }
}

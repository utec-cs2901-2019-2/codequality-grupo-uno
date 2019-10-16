package calculator;

public class Multiplication extends Operation {
    public Multiplication(float firstOperand, float secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    public float operate() {
        return firstOperand*secondOperand;
    }
}

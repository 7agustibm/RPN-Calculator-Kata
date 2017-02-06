import java.util.ArrayList;

public class RPNCalculator {
    private int result;
    private ArrayList<Integer> stack;

    public RPNCalculator() {
        this.result = 0;
        this.stack = new ArrayList<Integer>();
    }

    public void number(int newNumber) {
        stack.add(newNumber);
    }

    public void divisor() {
        calculate("divisor");
    }

    public void plus() {
        calculate("plus");
    }

    public void subtract() {
        calculate("subtract");
    }

    public void multiply() {
        calculate("multiply");
    }

    public int result() {
        return this.result;
    }

    private void calculate(String operator) {
        Integer firstNumber = getFirstNumber();
        Integer secondNumber = getSecondNumber();
        switch (operator) {
            case "divisor":
                this.result = secondNumber / firstNumber;
                break;
            case "plus":
                this.result = secondNumber + firstNumber;
                break;
            case "subtract":
                this.result = secondNumber - firstNumber;
                break;
            case "multiply":
                this.result = secondNumber * firstNumber;
                break;
        }

        this.stack.set(getLastIndex(), this.result);
    }

    private int getLastIndex() {
        return this.stack.size() - 1;
    }

    private Integer getSecondNumber() {
        return this.stack.get(getLastIndex());
    }

    private Integer getFirstNumber() {
        int lastIndex = getLastIndex();
        Integer firstNumber = this.stack.get(lastIndex);
        this.stack.remove(lastIndex);
        return firstNumber;
    }
}

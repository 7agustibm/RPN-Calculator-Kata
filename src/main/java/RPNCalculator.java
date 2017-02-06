import java.util.ArrayList;

public class RPNCalculator {
    private int result;
    private ArrayList<Integer> stack;

    public RPNCalculator(){
        this.result = 0;
        this.stack = new ArrayList<Integer>();
    }
    public void number(int newNumber) {
        stack.add(newNumber);
    }

    public void divisor() {
        Integer firstNumber = getFirstNumber();
        Integer secondNumber = getSecondNumber();
        int resultFroDivisor = secondNumber / firstNumber;
        this.result = resultFroDivisor;
    }

    public void plus() {
        Integer firstNumber = getFirstNumber();
        Integer secondNumber = getSecondNumber();
        int resultFroDivisor = secondNumber + firstNumber;
        this.result = resultFroDivisor;
    }

    public int result() {
        return this.result;
    }

    public void subtract() {
        Integer firstNumber = getFirstNumber();
        Integer secondNumber = getSecondNumber();
        int resultFroDivisor = secondNumber - firstNumber;
        this.result = resultFroDivisor;
    }


    private Integer getSecondNumber() {
        return this.stack.get(this.stack.size()-2);
    }

    private Integer getFirstNumber() {
        return this.stack.get(this.stack.size()-1);
    }
}

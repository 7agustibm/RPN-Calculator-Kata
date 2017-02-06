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
        Integer firstNumber = this.stack.get(this.stack.size()-1);
        Integer secondNumber = this.stack.get(this.stack.size()-2);
        this.stack.remove(this.stack.size()-1);
        int resultFroDivisor = secondNumber / firstNumber;
        this.stack.set(this.stack.size()-1, resultFroDivisor);
        this.result = resultFroDivisor;
    }

    public int result() {
        return this.result;
    }
}

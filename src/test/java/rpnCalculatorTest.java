import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class rpnCalculatorTest {
    @Test
    public void test_with_divisor(){
        RPNCalculator calculator = new RPNCalculator();
        calculator.number(20);
        calculator.number(5);
        calculator.divisor();
        int result = calculator.result();

        assertEquals(result, 4);
    }

    @Test
    public void test_with_plus(){
        RPNCalculator calculator = new RPNCalculator();
        calculator.number(10);
        calculator.number(5);
        calculator.plus();
        int result = calculator.result();

        assertEquals(result, 15);
    }

    @Test
    public void test_with_subtract(){
        RPNCalculator calculator = new RPNCalculator();
        calculator.number(10);
        calculator.number(5);
        calculator.subtract();
        int result = calculator.result();

        assertEquals(result, 5);
    }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class rpnCalculatorTest {
    RPNCalculator calculator;
    int firstNumber = 20;
    int secondNumber = 5;

    @BeforeEach
    void setUp() {
        calculator = new RPNCalculator();
        calculator.number(firstNumber);
        calculator.number(secondNumber);
    }

    @Test
    void test_with_divisor(){
        calculator.divisor();
        int result = calculator.result();

        int expected = firstNumber / secondNumber;
        assertEquals(result, expected);
    }

    @Test
    void test_with_plus(){
        calculator.plus();
        int result = calculator.result();

        int expected = firstNumber + secondNumber;
        assertEquals(result, expected);
    }

    @Test
    void test_with_subtract(){
        calculator.subtract();
        int result = calculator.result();
        int expected = firstNumber - secondNumber;
        assertEquals(result, expected);
    }
}

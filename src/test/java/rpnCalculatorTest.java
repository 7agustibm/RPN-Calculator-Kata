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

    @Test
    void test_with_multiply(){
        calculator.multiply();
        int result = calculator.result();
        int expected = firstNumber * secondNumber;
        assertEquals(result, expected);
    }

    @Test
    void test_with_plus_and_subtract(){
        calculator = new RPNCalculator();
        calculator.number(4);
        calculator.number(2);
        calculator.plus();
        calculator.number(3);
        calculator.subtract();
        int result = calculator.result();
        int expected = 4 + 2 - 3;
        assertEquals(result, expected);
    }

    @Test
    void test_with_multiply_plus_multiply(){
        int firstNumber = 3;
        int secondNumber = 5;
        int thirdNumber = 8;
        int fourthNumber = 7;

        calculator = new RPNCalculator();
        calculator.number(firstNumber);
        calculator.number(secondNumber);
        calculator.number(thirdNumber);
        calculator.multiply();
        calculator.number(fourthNumber);
        calculator.plus();
        calculator.multiply();
        int result = calculator.result();
        int expected = firstNumber * ((secondNumber * thirdNumber) + fourthNumber);
        assertEquals(result, expected);
    }
}

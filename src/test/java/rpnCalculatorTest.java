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

}

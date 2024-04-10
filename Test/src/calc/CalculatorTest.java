package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testAdd(){
    Calculator calclator = new Calculator();
    assertEquals(5, calclator.add(2, 3));
    }

    @Test
    void testSubstract(){
    Calculator calculator = new Calculator();
    assertEquals(-1, calculator.substract(2, 3));
    }

}

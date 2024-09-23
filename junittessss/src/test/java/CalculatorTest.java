import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void plus() {
        Calculator calculator = new Calculator();
        double ext=15;
        double result = calculator.plus(10,5);
        assertEquals(ext,result,0.01);
    }

    @Test
    public void minus() {
        Calculator calculator1 = new Calculator();
        double ext=10;
        double result = calculator1.minus(20,10);
        assertEquals(ext,result,0.01);
    }

    @Test
    public void umn() {
        Calculator calculator2 = new Calculator();
        double ext=35;
        double result = calculator2.umn(7,5);
        assertEquals(ext,result,0.01);
    }

    @Test
    public void del() {
        Calculator calculator3 = new Calculator();
        double ext=10;
        double result = calculator3.del(100,10);
        assertEquals(ext,result,0.01);
    }
}
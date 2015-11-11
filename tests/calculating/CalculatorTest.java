package calculating;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Martyna on 2015-10-29.
 */
public class CalculatorTest {

    @Test
    public void testTrueShouldBeEqualTrue() {
        assertEquals("true equals true", true, true == true);
    }

    @Test
    public void evaluate_additionOfTwoPositiveIntegers_ok() {

        assertEquals( 4F, Calculator.evaluate("2+2"), 0.01);
        assertEquals( 2F, Calculator.evaluate("0+2"), 0.01);
        assertEquals( 2F, Calculator.evaluate("2+0"), 0.01);
        assertEquals( 14F, Calculator.evaluate("10+4"), 0.01);
        assertEquals( 106F, Calculator.evaluate("102+4"), 0.01);
        assertEquals( 0.8F, Calculator.evaluate("0.4+0.4"), 0.01);
        assertEquals( 1.4F, Calculator.evaluate("1+0.4"), 0.01);
    }

    @Test
    public void evaluate_subtractionOfTwoPositiveIntegers_ok() {

        assertEquals(3F, Calculator.evaluate("5-2"), 0.01);
        assertEquals(-3F, Calculator.evaluate("2-5"), 0.01);
        assertEquals(3.1F, Calculator.evaluate("5.1-2"), 0.01);
        assertEquals(-3.1F, Calculator.evaluate("2-5.1"), 0.01);
        assertEquals(8F, Calculator.evaluate("10-2"), 0.01);
        assertEquals(102F, Calculator.evaluate("122-20"), 0.01);
    }

    @Test
    public void evaluate_dividingTwoPositiveIntegers_ok() {

        assertEquals(3F, Calculator.evaluate("9/3"), 0.01);
        assertEquals(3.33F, Calculator.evaluate("10/3"), 0.01);
        assertEquals(2.5F, Calculator.evaluate("5/2"), 0.01);
        assertEquals(0.5F, Calculator.evaluate("1/2"), 0.01);
        assertEquals(0.01F, Calculator.evaluate("1/100"), 0.01);
    }

   /* @Test
    public void evaluate_dividingByZero_ex() {

        Calculator.evaluate("2/0");
        fail();

    }*/

    @Test
    public void multiplyingTwoPositiveIntegers() {

        assertEquals(10F, Calculator.evaluate("5*2"), 0.01);
        assertEquals(1F, Calculator.evaluate("0.5*2"), 0.01);
        assertEquals(0.25F, Calculator.evaluate("0.5*0.5"), 0.01);
    }
}
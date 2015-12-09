package calculating;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Martyna on 2015-10-29.
 */

/*
** Integers: Two Positive
** Integers: First Negative
** Integers: Second Negative(loading...)
** Integers: Two Negative(loading...)
** Reals: Two Positive
 */
public class CalculatorTest {

    @Test
    public void testTrueShouldBeEqualTrue() {
        assertEquals("true equals true", true, true == true);
    }
/* Positive Integers */

    @Test
    public void evaluate_additionOfTwoPositiveIntegers_ok() {

        assertEquals(4F, Calculator.evaluate("2+2"), 0.01);
        assertEquals(2F, Calculator.evaluate("0+2"), 0.01);
        assertEquals(2F, Calculator.evaluate("2+0"), 0.01);
        assertEquals(12F, Calculator.evaluate("10+2"), 0.01);
        assertEquals(102F, Calculator.evaluate("100+2"), 0.01);
    }

    @Test
    public void evaluate_subtractionOfTwoPositiveIntegersPositiveResult_ok() {

        assertEquals(3F, Calculator.evaluate("5-2"), 0.01);
        assertEquals(8F, Calculator.evaluate("10-2"), 0.01);
        assertEquals(80F, Calculator.evaluate("100-20"), 0.01);
        assertEquals(5F, Calculator.evaluate("5-0"), 0.01);
    }

    @Test
    public void evaluate_subtractionOfTwoPositiveIntegersNegativeResult_ok() {

        assertEquals(-3F, Calculator.evaluate("2-5"), 0.01);
        assertEquals(-8F, Calculator.evaluate("2-10"), 0.01);
        assertEquals(-80F, Calculator.evaluate("20-100"), 0.01);
        assertEquals(-5F, Calculator.evaluate("0-5"), 0.01);
    }

    @Test
    public void multiplyingTwoPositiveIntegers() {

        assertEquals(10F, Calculator.evaluate("5*2"), 0.01);
        assertEquals(100F, Calculator.evaluate("50*2"), 0.01);
        assertEquals(100F, Calculator.evaluate("10*10"), 0.01);
        assertEquals(5F, Calculator.evaluate("5*1"), 0.01);
        assertEquals(0F, Calculator.evaluate("5*0"), 0.01);

    }

    @Test
    public void evaluate_dividingTwoPositiveIntegers_ok() {

        assertEquals(0F, Calculator.evaluate("0/3"), 0.01);
        assertEquals(3F, Calculator.evaluate("9/3"), 0.01);
        assertEquals(3.33F, Calculator.evaluate("10/3"), 0.01);
        assertEquals(2.5F, Calculator.evaluate("5/2"), 0.01);
        assertEquals(0.5F, Calculator.evaluate("1/2"), 0.01);
        assertEquals(0.01F, Calculator.evaluate("1/100"), 0.01);
    }

    @Test
    public void evaluate_dividingByZeroFirstPositive_ok() {

        try {
            Calculator.evaluate("2/0");
        } catch (Exception e) {
            final String expected = "Nie wolno dzielic przez 0!";
            assertEquals(expected, e.getMessage());
        }

    }


/* Negative-First Integers */


    @Test
    public void evaluate_additionOfTwoIntegersFirstNegative_ok() {

        assertEquals(0F, Calculator.evaluate("-2+2"), 0.01);
        assertEquals(-2F, Calculator.evaluate("-2+0"), 0.01);
        assertEquals(-8F, Calculator.evaluate("-10+2"), 0.01);
        assertEquals(-98F, Calculator.evaluate("-100+2"), 0.01);
    }

    @Test
    public void evaluate_subtractionOfTwoIntegersFirstNegative_ok() {

        assertEquals(-5F, Calculator.evaluate("-5-0"), 0.01);
        assertEquals(-7F, Calculator.evaluate("-5-2"), 0.01);
        assertEquals(-7F, Calculator.evaluate("-2-5"), 0.01);
        assertEquals(-12F, Calculator.evaluate("-10-2"), 0.01);
        assertEquals(-120F, Calculator.evaluate("-100-20"), 0.01);
    }

    @Test
    public void multiplyingTwoIntegersFirstNegative() {

        assertEquals(-0F, Calculator.evaluate("-5*0"), 0.01);
        assertEquals(-10F, Calculator.evaluate("-5*2"), 0.01);
        assertEquals(-100F, Calculator.evaluate("-50*2"), 0.01);
        assertEquals(-100F, Calculator.evaluate("-10*10"), 0.01);
    }

    @Test
    public void evaluate_dividingTwoIntegersFirstNegative_ok() {

        assertEquals(-3F, Calculator.evaluate("-9/3"), 0.01);
        assertEquals(-3.33F, Calculator.evaluate("-10/3"), 0.01);
        assertEquals(-2.5F, Calculator.evaluate("-5/2"), 0.01);
        assertEquals(-0.5F, Calculator.evaluate("-1/2"), 0.01);
        assertEquals(-0.01F, Calculator.evaluate("-1/100"), 0.01);
    }

    @Test
    public void evaluate_dividingByZeroFirstNegative_ok() {

        try {
            Calculator.evaluate("-2/0");
        } catch (Exception e) {
            final String expected = "Nie wolno dzielic przez 0!";
            assertEquals(expected, e.getMessage());
        }


    }


 /* Positive Reals */

    @Test
    public void evaluate_additionOfTwoPositiveReals_ok() {

        assertEquals(0.4F, Calculator.evaluate("0.4+0"), 0.01);
        assertEquals(0.8F, Calculator.evaluate("0.4+0.4"), 0.01);
        assertEquals(1.4F, Calculator.evaluate("1+0.4"), 0.01);
        assertEquals(2.5F, Calculator.evaluate("1.1+1.4"), 0.01);
        assertEquals(20.52F, Calculator.evaluate("10.12+10.4"), 0.01);
    }

    @Test
    public void multiplyingTwoPositiveReals() {

        assertEquals(0F, Calculator.evaluate("0.5*0"), 0.01);
        assertEquals(1F, Calculator.evaluate("0.5*2"), 0.01);
        assertEquals(0.25F, Calculator.evaluate("0.5*0.5"), 0.01);
    }

    @Test
    public void evaluate_subtractionOfTwoPositiveReals_ok() {

        assertEquals(5.1F, Calculator.evaluate("5.1-0"), 0.01);
        assertEquals(3.1F, Calculator.evaluate("5.1-2"), 0.01);
        assertEquals(-3.1F, Calculator.evaluate("2-5.1"), 0.01);
        assertEquals(4.9F, Calculator.evaluate("10-5.1"), 0.01);
        assertEquals(0.01F, Calculator.evaluate("1-0.99"), 0.01);

    }

    @Test
    public void evaluate_dividingByZeroReal_ok() {

        try {
            Calculator.evaluate("2.1/0");
        } catch (Exception e) {
            final String expected = "Nie wolno dzielic przez 0!";
            assertEquals(expected, e.getMessage());
        }


    }

/* First-Negative Reals */

    @Test
    public void evaluate_additionOfTwoRealsFirstNegative_ok() {

        assertEquals(-0.21F, Calculator.evaluate("-2.21+2"), 0.01);
        assertEquals(-2.31F, Calculator.evaluate("-2.31+0"), 0.01);
        assertEquals(-8.8F, Calculator.evaluate("-10.8+2"), 0.01);
        assertEquals(-98.1F, Calculator.evaluate("-100.1+2"), 0.01);
    }

    @Test
    public void evaluate_subtractionOfTwoRealsFirstNegative_ok() {

        assertEquals(-7.12F, Calculator.evaluate("-5.12-2"), 0.01);
        assertEquals(-7.25F, Calculator.evaluate("-2.25-5"), 0.01);
        assertEquals(-12.13F, Calculator.evaluate("-10.13-2"), 0.01);
        assertEquals(-120.05F, Calculator.evaluate("-100.05-20"), 0.01);
    }

    @Test
    public void multiplyingTwoRealsFirstNegative() {

        assertEquals(-10.2F, Calculator.evaluate("-5.1*2"), 0.01);
        assertEquals(-100.7F, Calculator.evaluate("-50.35*2"), 0.01);
        assertEquals(-101.2F, Calculator.evaluate("-10.12*10"), 0.01);
    }

    @Test
    public void evaluate_dividingTwoRealsFirstNegative_ok() {

        assertEquals(-3.3F, Calculator.evaluate("-9.9/3"), 0.01);
        assertEquals(-4.03F, Calculator.evaluate("-12.12/3"), 0.01);
        assertEquals(-2.75F, Calculator.evaluate("-5.5/2"), 0.01);
        assertEquals(-0.7F, Calculator.evaluate("-1.4/2"), 0.01);
        assertEquals(-0.015F, Calculator.evaluate("-1.5/100"), 0.01);
    }

    @Test
    public void evaluate_dividingByZeroFirstNegativeReal_ok() {

        try {
            Calculator.evaluate("-2.1/0");
        }
        catch (Exception e) {
            final String expected = "Nie wolno dzielic przez 0!";
            assertEquals(expected, e.getMessage());
        }

    }

    //Incorrect format
    @Test
    public void evaluate_incorrectFormatOfExpression() {

        try {
            Calculator.evaluate("abc");
        }
        catch (Exception e) {
            final String expected = "Niepoprawny format wyrazenia!";
            assertEquals(expected, e.getMessage());
        }

    }

}
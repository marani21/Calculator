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

        assertEquals( 4F, Calculator.evaluate("2+2"), 0.01);
        assertEquals( 2F, Calculator.evaluate("0+2"), 0.01);
        assertEquals( 2F, Calculator.evaluate("2+0"), 0.01);
        assertEquals( 12F, Calculator.evaluate("10+2"), 0.01);
        assertEquals( 102F, Calculator.evaluate("100+2"), 0.01);
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

        assertEquals(3F, Calculator.evaluate("9/3"), 0.01);
        assertEquals(3.33F, Calculator.evaluate("10/3"), 0.01);
        assertEquals(2.5F, Calculator.evaluate("5/2"), 0.01);
        assertEquals(0.5F, Calculator.evaluate("1/2"), 0.01);
        assertEquals(0.01F, Calculator.evaluate("1/100"), 0.01);
    }

   @Test
   public void evaluate_dividingByZeroFirstPositive_ok() {

       assertEquals(Float.POSITIVE_INFINITY, Calculator.evaluate("2/0"), 0.01);

   }


/* Negative-First Integers */


    @Test
    public void evaluate_additionOfTwoIntegersFirstNegative_ok() {

        assertEquals( 0F, Calculator.evaluate("-2+2"), 0.01);
        assertEquals( -2F, Calculator.evaluate("-2+0"), 0.01);
        assertEquals( -8F, Calculator.evaluate("-10+2"), 0.01);
        assertEquals( -98F, Calculator.evaluate("-100+2"), 0.01);
    }

    @Test
    public void evaluate_subtractionOfTwoIntegersFirstNegative_ok() {

        assertEquals(-7F, Calculator.evaluate("-5-2"), 0.01);
        assertEquals(-7F, Calculator.evaluate("-2-5"), 0.01);
        assertEquals(-12F, Calculator.evaluate("-10-2"), 0.01);
        assertEquals(-120F, Calculator.evaluate("-100-20"), 0.01);
    }

    @Test
    public void multiplyingTwoIntegersFirstNegative() {

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

        assertEquals(Float.NEGATIVE_INFINITY, Calculator.evaluate("-2/0"), 0.01);

    }


 /* Positive Reals */

    @Test
    public void evaluate_additionOfTwoPositiveReals_ok() {


        assertEquals( 0.8F, Calculator.evaluate("0.4+0.4"), 0.01);
        assertEquals( 1.4F, Calculator.evaluate("1+0.4"), 0.01);
        assertEquals( 2.5F, Calculator.evaluate("1.1+1.4"), 0.01);
        assertEquals( 20.52F, Calculator.evaluate("10.12+10.4"), 0.01);
    }

    @Test
    public void multiplyingTwoPositiveReals() {


         assertEquals(1F, Calculator.evaluate("0.5*2"), 0.01);
         assertEquals(0.25F, Calculator.evaluate("0.5*0.5"), 0.01);
    }

    @Test
    public void evaluate_subtractionOfTwoPositiveReals_ok() {

        assertEquals(3.1F, Calculator.evaluate("5.1-2"), 0.01);
        assertEquals(-3.1F, Calculator.evaluate("2-5.1"), 0.01);
        assertEquals(4.9F, Calculator.evaluate("10-5.1"), 0.01);
        assertEquals(0.01F, Calculator.evaluate("1-0.99"), 0.01);

    }

/* Negative Reals */


}
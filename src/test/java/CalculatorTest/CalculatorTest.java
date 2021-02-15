package CalculatorTest;


import Calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calculator;

    @BeforeClass
    public void setCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void CalculatorTest()  {
        int actual = calculator.add(1,6);
        int expected = 7;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void addPositiveNumbersTest()  {
        double actual = calculator.add(1.5,6.2);
        double expected = 7.7;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void subNegativeNumbersTest()  {
        int actual = calculator.sub(8,6);
        int expected = 2;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void subNegaNumbersTest()  {
        double actual = calculator.sub(11.5,6.2);
        double expected = 5.3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void multiplyPositiveNumbersTest()  {
        double actual = calculator.multiply(1.5,6.2);
        double expected = 9.3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void divNegativeNumbersTest()  {
        double actual = calculator.div(21.5,6.2);
        double expected = 3.46;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void isEvenBoolenTest()  {
        boolean actual = calculator.isEven(15);
        boolean expected = true;
        Assert.assertEquals(actual, expected);
    }


}
package firstTest;

import org.testng.Assert;
import org.testng.annotations.*;

public class beforeAndAfterMetodsTest {
    @BeforeClass
    public void setUp() {
        System.out.println(" Before class");
    }

    @AfterClass
    public void finish() {
        System.out.println("After class");
    }

    @Test
    public void testIntPositiveNumbers() {
        int actual = 1 + 2;
        int expected = 3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testIntNegativeNumbers() {
        int actual = -1 - -2;
        int expected = -1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testDoubleNumbers() {
        double actual = 1.5 + 2.99;
        double expected = 4.44;
    }

    @BeforeMethod
    public void beforeTests() {
        System.out.println("Before method");
    }

    @AfterMethod
    public void afterTest() {
        System.out.println("After method");
    }

    @DataProvider(name = "testDataForAddition")
    public Object[][] testDataForAddition() {
        return new Object[][]{
                {1, 2, 3}
        }
    }
}
package turtles;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {

    @Test
    public void testFactorial () {
        Integer x = 6;
        Assert.assertEquals(x,Recursion.factorial(3));
    }
    @Test
    public void testGCD () {
        Integer x = 15;

        Assert.assertEquals(x,GCD.gcd(60,45));
    }
}
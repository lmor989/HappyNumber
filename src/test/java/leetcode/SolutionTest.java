package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Solution sl = new Solution();

    @Test
    public void isHappyTest() {
        int input = 19;
        
        boolean expected = true;
        boolean actual = sl.isHappy(input);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void isHappyTest2() {
        int input = 2;

        boolean expected = false;
        boolean actual = sl.isHappy(input);

        Assert.assertEquals(expected, actual);

    }
}

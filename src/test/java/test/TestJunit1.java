package test;

import org.junit.Assert;// keyword here
import org.junit.Test;

public class TestJunit1 {
    @Test
    public void testcase1() {
        Assert.assertEquals(1, 1);
    }
    
    @Test
    public void testcase2() {
    	int result = 1 + 5;
        Assert.assertTrue(result == 6);;
    }
    
    @Test
    public void testcase3() {
        Assert.assertEquals(1, 1);
    }
    
    @Test
    public void testcase4() {
        Assert.assertEquals(1, 1);
    }
}

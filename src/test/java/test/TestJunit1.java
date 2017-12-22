package test;

import org.junit.Assert;// keyword here
import org.junit.Test;

public class TestJunit1 {
    @Test
    public void testcase1() {
    	System.out.println("====================== testcase1 is running");
        Assert.assertEquals(1, 1);
    }
    
    @Test
    public void testcase2() {
    	System.out.println("====================== testcase2 is running");
    	int result = 1 + 5;
        Assert.assertTrue(result == 6);;
    }
    
    @Test
    public void testcase3() {
    	System.out.println("====================== testcase3 is running");
        Assert.assertEquals(1, 1);
    }
    
    @Test
    public void testcase4() {
    	System.out.println("====================== testcase4 is running");
        Assert.assertEquals(1, 1);
    }
}

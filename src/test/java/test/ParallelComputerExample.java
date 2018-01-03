package test;

import org.junit.Assert;// keyword here
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.rules.TestName;
import org.junit.runner.JUnitCore;

/**
run parallel:
cách này có nhược điểm là ko show result testcase true/false trên eclipse và Maven.
Tuy nhiên cách này chạy tốt với multi thread.

 */
public class ParallelComputerExample {

    @Test
    public void runAllTests() {
        Class<?>[] classes = { ParallelTest1.class, ParallelTest2.class };

        // ParallelComputer(true,true) will run all classes and methods in parallel. 
        //  ParallelComputer(First arg for classes, second arg for methods)
        JUnitCore.runClasses(new ParallelComputer(true, true), classes);
        
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }

    public static class ParallelTest1 {
    	//use to get function name of testcase
    	@Rule public TestName name = new TestName();
    	
        @Test
        public void test1a() {
        	System.out.println(this.getClass().getName() +"."+ name.getMethodName());
            lookBusy(1000);
            Assert.assertTrue(true);
        }

        @Test
        public void test1b() {
        	System.out.println(this.getClass().getName() +"."+ name.getMethodName());
            lookBusy(1000);
            Assert.assertTrue(false);
        }
    }

    public static class ParallelTest2 {
    	//dùng để lấy tên của testcase
    	@Rule public TestName name = new TestName();
        @Test
        public void test2a() {
        	System.out.println(this.getClass().getName() +"."+ name.getMethodName());
            lookBusy(1000);
            Assert.assertTrue(true);
        }

        @Test
        public void test2b() {
        	System.out.println(this.getClass().getName() +"."+ name.getMethodName());
            lookBusy(1000);
            Assert.assertTrue(true);
        }
    }

    public static void lookBusy(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
    }
}

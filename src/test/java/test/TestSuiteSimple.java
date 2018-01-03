package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Suite class: hỗ trợ run nhiều testcase 1 lúc (synchronous on 1 thread).
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ TestJunitBasic.class, TestJunitBasic2.class })
public class TestSuiteSimple {

}

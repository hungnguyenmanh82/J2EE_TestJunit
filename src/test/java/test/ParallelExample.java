package test;

import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.RunWith;

/**
 * Eclipse ko hỗ trợ report kết quả test khi dùng parallel run test case.
 */
/** pom.xml:
	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>2.7.1</version>
				<configuration>
					<parallel>methods</parallel>
					<threadCount>5</threadCount>
					<includes>
						<include>test/ParallelExample.java</include>
					</includes>
				</configuration>
			</plugin>
		</plugins>
	</build>
 */
public class ParallelExample {
    @Test
    public void shouldRunInParallel1() {
        System.out.println("I'm running on thread " + Thread.currentThread().getName());
    }

    @Test
    public void shouldRunInParallel2() {
    	System.out.println("I'm running on thread " + Thread.currentThread().getName());
    }

    @Test
    public void shouldRunInParallel3() {
    	System.out.println("I'm running on thread " + Thread.currentThread().getName());
    }
}

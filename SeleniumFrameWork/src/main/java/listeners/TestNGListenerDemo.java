package listeners;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import org.apache.logging.log4j.core.util.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(listeners.TestNGListener.class)
public class TestNGListenerDemo {
	@Test
	public void test1() {

		System.out.println("I am in test1");
	}

	@Test
	public void test2() {

		System.out.println("I am in test2");
		
	}

	@Test
	public void test3() {

		System.out.println("I am in test3");
	}



}

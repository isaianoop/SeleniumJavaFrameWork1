package demo;

import org.testng.annotations.Test;

public class TestNGGroupsDemo {

	@Test(groups= {"sanity"})
	public void test1() {
	System.out.println("We are in test1");	
	}
	
	@Test(groups= {"sanity","smoke"})
	public void test2() {
	System.out.println("We are in test2");	
	}
	
	@Test(groups= {"sanity","regression"})
	public void test3() {
	System.out.println("We are in test3");	
	}
	
	@Test
	public void test4() {
	System.out.println("We are in test4");	
	}
	
	
}

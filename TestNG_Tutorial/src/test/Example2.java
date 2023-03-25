package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example2 {

	@Test
	
	public void TestCase3()
	{
		System.out.println("TestCase Passed");
	}
	@Test
	
	public void TestCase4()
	{
		System.out.println("TestCase Passed");
	}
	@Test

	public void TestCase5()
	{
	System.out.println("TestCase Passed");
	}
	@Test

	public void TestCase6()
	{
	System.out.println("TestCase Passed");
	}
	@BeforeTest

	public void MobileSignin()
	{
	System.out.println("Mobile TestCase Passed");
	}
	@Test

	public void MobileLogin()
	{
	System.out.println("Mobile TestCase Passed");
	}
	@AfterSuite

	public void MobileLogout()
	{
	System.out.println("Mobile TestCase Passed");
	}
}

package com.basics.junit.testcontroller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.basics.junit.cotrollers.MainController;

public class MainControllerTest {

	MainController m=new MainController();
	
	@BeforeClass
	public static void beforeClassSetup()
	{
		System.out.println("Before Class Executed");
	}
	
	@Before
	public void beforeTest()
	{
		System.out.println("Before Test Executed");
	}
	
	@Test(timeout=1)
	public void palindromeCheckTest() throws Exception
	{
		assertEquals(true, m.palindromeCheck("MalayalaM"));
		assertFalse(m.palindromeCheck("India"));
		assertTrue(m.palindromeCheck("alla"));
		System.out.println("Palindrome Test Executed");
	}
	
	/*The below test case will pass if the method 
	 * throws an arithmetic exception*/
	
	@Test(expected=ArithmeticException.class)
	public void divisionCheckTest() throws Exception
	{
		assertEquals(1, m.divisionCheck(2, 0));
	}
	
	@After
	public void afterTest()
	{
		System.out.println("After Test Executed");
	}
	
	@AfterClass
	public static void afterTearDownSetup()
	{
		System.out.println("After Class TearDown Executed");
	}
}

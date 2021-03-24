package com.basics.junit.testcontroller;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.basics.junit.controller.SubController;

@Ignore
public class SubControllerTest {

	SubController s=new SubController();
	@BeforeClass
	public static void beforeClassTest()
	{
		System.out.println("Before class executed");
	}
	
	@Before
	public void beforeTest()
	{
		System.out.println("Before executed");
	}
	
	@Ignore("Not Yet Ready, Please ignore")
	@Test
	public void subtractNumberTest() throws Exception
	{
		System.out.println("Substract Controller Testing");
		assertEquals(3, s.subtractNumbers(4, 1));
	}
	
	@After
	public void afterTest()
	{
		System.out.println("After executed");
	}
	
	@AfterClass
	public static void afterClassTest()
	{
		System.out.println("After class executed");
	}
}

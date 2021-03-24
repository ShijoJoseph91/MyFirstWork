package com.basics.junit.testcontroller;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;

import com.basics.junit.controller.AddController;

public class AddControllerTest {

	AddController a=new AddController();
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
	
	@Test
	public void addNumberTest() throws Exception
	{
		assertEquals(3, a.addNumbers(1, 2));
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

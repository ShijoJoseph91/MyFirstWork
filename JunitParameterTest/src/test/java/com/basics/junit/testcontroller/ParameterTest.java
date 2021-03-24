package com.basics.junit.testcontroller;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import com.basics.junit.controller.ArithmeticExample;

@RunWith(Parameterized.class)
public class ParameterTest {

	private int fnumber;
	private int snumber;
	private int expected;
	private ArithmeticExample arithmeticExample;
	
	public ParameterTest(int fnumber, int snumber, int expected) {
		super();
		this.fnumber = fnumber;
		this.snumber = snumber;
		this.expected = expected;
	}
	
	@Before
	public void initialize()
	{
		arithmeticExample=new ArithmeticExample();
	}

	@Parameterized.Parameters
	public static Collection input()
	{
		return Arrays.asList(new Object[][]{{1,2,3},{3,4,7},{6,7,13}});
	}
	
	@Test
	public void arithmeticTest()
	{
		System.out.println("Result is = "+ expected);
		assertEquals(expected, arithmeticExample.addNumbers(fnumber, snumber));
	}
	
}

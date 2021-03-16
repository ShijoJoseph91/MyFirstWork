package com.test.demo;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		System.out.println(addNumber(20,30));
		System.out.println(ConcatString("Hello","world"));
	}

	private static String ConcatString(String string, String string2) {
		// TODO Auto-generated method stub
		return string + string2;
	}

	private static int addNumber(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

}

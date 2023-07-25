package com.hackerrank.selenium;

public class Test {
	public static void main(String[] args) throws Exception{
		
		System.out.println("**********************");
		int x = 3;
		if (x == 2);
			x = 0;
		if(x==3)
			x++;
		else
			x+=2;
		System.out.println(x);
		System.out.println("**********************");
		
		
		System.out.println(stringReversal("Varun"));
		//nuraV
		try {
			assert false;
			System.out.println("t");
		}catch (Error e) {
			System.err.println("c");
			throw new Exception();
		}finally {
			System.out.println("f");
		}
	}
	
	private static String stringReversal(String inputString) {
		
		int len = inputString.length();

		char[] arr = new char[len];
		String brr = "";
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = inputString.charAt(i);
		}
		
		int j=0;
		for (int i = arr.length-1; i >= 0; i--) {
			brr = arr[j++]+brr;	
		}
		
		return brr;
	}
	
}

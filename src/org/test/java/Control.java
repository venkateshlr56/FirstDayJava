package org.test.java;

public class Control {
	
	public int add(int a,int b) {
		
		int c=a+b;
		return c;
		
	}
	
	public static void main(String[] args) {
		
		Control d=new Control();
		int sum=d.add(10, 20);
		System.out.println("Sum of a and b is:"+sum);
	}
}

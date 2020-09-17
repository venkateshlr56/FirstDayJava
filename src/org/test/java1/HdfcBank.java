package org.test.java1;

public class HdfcBank implements RbiBank,AxisBank{

	@Override
	public void current() {
		System.out.println("Current : 1%");
		
	}

	@Override
	public void savings() {
		System.out.println("Savings : 3%");
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposit : 2%");
	}

	
	public void fixed() {
		
		System.out.println("Fixed : 5%");

	}
	
	public static void main(String[] args) {
		
		HdfcBank h=new HdfcBank();
		h.savings();
		h.deposit();
		h.fixed();
		h.current();
	}


}

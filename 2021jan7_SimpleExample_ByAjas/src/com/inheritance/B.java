package com.inheritance;

public class B extends A {
	
	int i=500;
	
	
	public void m2() {
		System.out.println("m2 of B");
		super.m2();
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		B b =new B();
		System.out.println(b.i);
		b.m2();
	}

	public static void m3() {
		System.out.println("M3 of B");
		B b=new B();
		b.m2();
	}
	
}

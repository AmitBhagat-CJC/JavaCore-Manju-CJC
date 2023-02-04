package com;

public class A {
	
	public int i=100;
	
	static {
		new A().i=500;
		System.out.println("Static of A");
	
	}
	public void m() {
		System.out.println("m of A");
		
	}
	public A() {
		//i=1000;
		//m();
		System.out.println(i);
		System.out.println("A constructor");
	}

	public static void main(String[] args) {
	//A a=new A();
		A a=new A();
		a.m();
	System.out.println(a.i);
		
	}
}

package com.inheritance;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
	
	public static void main(String[] args) {
		System.out.println(args[0]);
		try {
			
		Class a= Class.forName(args[0]);
			 Method[] m= a.getMethods();
			 for(Method m1:m) {
				 System.out.println("Methods : " +m1);
			 }
		Constructor[] c=a.getConstructors();
		for(Constructor c1:c) {
			System.out.println("Constructor of A : " + c1);
		}
		
		Field[] f=a.getFields();
		for(Field f1:f) {
			System.out.println("Field Name : " +f1);
		}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	          
	}
}

package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("E:\\img\\ABC.txt");
		
//		if(f.mkdir()) {
//			System.out.println(f);
//		}
		FileWriter fWriter=new FileWriter(f);
		fWriter.write("Hi This is Trap By Anonymous Hacker : -We are legends....!");
	
		fWriter.close();
		
		if(f.exists()) {
			System.out.println(" File Name : " + f.getName());
			System.out.println("File Path :  " + f.getAbsolutePath());
			System.out.println("File Path :  " + f.getCanonicalPath());
			System.out.println(f.canRead());
		}

	}

}

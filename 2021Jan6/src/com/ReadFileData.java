package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileData {
	
	public static void main(String[] args) throws IOException {
		int byteread= -1;
		File file=new File("E:\\img\\ABC.txt");
		//By Using Scanner Class
		Scanner scanner=new Scanner(file);
		
		while(scanner.hasNextLine()) {
			String data=scanner.nextLine();
			System.out.println(data);
		}
		//By Using FileReader
		System.out.println("=====================file Read Using Filereader==================");
		FileReader fr=new FileReader(file);
		   
		System.out.println(file.length());
		while((byteread=fr.read()) !=-1) {
			System.out.print((char)byteread);
		}
	}

}

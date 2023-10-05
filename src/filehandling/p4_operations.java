package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class p4_operations {

	public static void main(String[] args) throws IOException {
		// create file 
		Scanner sc = new Scanner(System.in);
		String fname;
		
//		System.out.println("enter the file name");
//		String fname =sc.next();
//		
//		File directory = new File("C:\\Users\\LENOVO\\Desktop\\filess\\"+fname+".txt");
//
//		if(directory.createNewFile())
//		{
//			System.out.println("file "+fname+" created successfully !!");
//		}
//		
//		else
//		{
//			System.out.println("Error in creating the file"+fname);
//		}
		
		
		//writting

		System.out.println("enter the file name where you want to write the data !");
		fname=sc.nextLine();
		
		FileWriter fw = new FileWriter("C:\\Users\\LENOVO\\Desktop\\filess\\"+fname+".txt");
		
		System.out.println("write the data you wants to write in the file !");
		String content =sc.nextLine();
		
		fw.write(content);
		
		System.out.println("Data written in the file successfully !!");
		
		fw.close();
		
		
		
	}

}

package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class p2_writting_in_file {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream f = new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\filess\\xyz.txt");
		
		f.write(10);
		f.write(25);
		f.write(50);
		f.write(70);
		
		f.close();
		
		System.out.println("data written successfully inside the file!");

	}

}




package filehandling;

import java.io.File;
import java.io.IOException;

public class p1_file_creation {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\LENOVO\\Desktop\\filess\\xyz.txt");
		
		if(f.createNewFile())
		{
			System.out.println("file created successfully !!");
		}
		else
		{
			System.out.println("file is not created !!");
		}

	}

}

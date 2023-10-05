package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class p5_final_project {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int ch=0;
		String fname;
		do
		{
			System.out.println("1.file creation ");
			System.out.println("2. Write the data in file ");
			System.out.println("3. Reading a file");
			System.out.println("4. Delete the file");
			System.out.println("5. show List of files ");
			System.out.println("6. search any file ");
			System.out.println("7. exit");
			
			
			System.out.println("enter your choice : ");
			 ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("enter the file name");
				fname =sc.next();
				
				File directory = new File("C:\\Users\\LENOVO\\Desktop\\filess\\"+fname+".txt");

				if(directory.createNewFile())
				{
					System.out.println("file "+fname+" created successfully !!");
				}
				
				else
				{
					if(directory.exists())
					{
						System.out.println("file "+fname+" Already exist");
					}
					else
					{
					
					System.out.println("Error in creating the file"+fname);
					}
				}
				
				break;
				
			case 2:
				
				String f2;
				
				System.out.println("enter the file name where you want to write the data !");
				f2=sc.next();
				
				FileWriter fw = new FileWriter("C:\\Users\\LENOVO\\Desktop\\filess\\"+f2+".txt");
			
				Scanner sc2= new Scanner(System.in);
			
				System.out.println("write the data you wants to write in the file !");
				String content;
				content=sc2.nextLine();
				
				fw.write(content);
				
				System.out.println("Data written in the file successfully !!");
				
				fw.close();
				
				break;
				
			case 3:
				
				System.out.println("enter the file name whose data you want to read ");
				String f3 =sc.next();
				
				File d3 = new File("C:\\Users\\LENOVO\\Desktop\\filess\\"+f3+".txt");
				Scanner sc3 = new Scanner(d3);
				
				while(sc3.hasNextLine())
				{
					String line =sc3.nextLine();
					System.out.println(line);
				}
				
				sc3.close();
				
				break;
				
			case 4:
				
				System.out.println("enter the file name whose data you wanna delete");
				String f4 =sc.next();
				
				File d4 = new File("C:\\Users\\LENOVO\\Desktop\\filess\\"+f4+".txt");
				
				d4.delete();
				
				System.out.println("file deleted successfully");
				break;
			case 5: 
				System.out.println("List of files and folders are ");
				File f5 = new File("C:\\Users\\LENOVO\\Desktop\\filess\\");
				File[] list= f5.listFiles();
				
				for(File f : list)
				{
					if(f.isDirectory())
					{
						System.out.println(f.getName());
					}
					else if(f.isFile())
					{
						System.out.println(f.getName());
					}
					
				}
				break;
				
			case 6: 
				
				System.out.println("enter the file name for searching ");
			    String filename	 = sc.next();
			    File f6 = new File("C:\\Users\\LENOVO\\Desktop\\filess\\");
			    
			    String l1[] = f6.list();
			    int g=0;
			    if(l1==null)
			    {
			    	System.out.println("there is no file present in the directory ");
			    }
			    else
			    {
			    	for(int i=0;i<l1.length;i++)
			    	{
			    		String search = l1[i];
			    		if(search.equalsIgnoreCase(filename))
			    		{
			    			System.out.println(search + " found");
			    			g=1;
			    		}
			    	}
			    }
			    
			    if(g==0)
			    {
			    	System.out.println("file not found ! ");
			    }
				
				break;
				
			case 7:
				System.exit(0);
				
			default:
				System.out.println("enter the valid choice ");
			}
			
		}
		
		while(ch!=8);

	}

}

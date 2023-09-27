package Array;

import java.util.Scanner;

public class oneDArray {

	public static void main(String[] args) {
//		int a[]= {10,20,30,40};// a[0], a[1]
		int i;
//		for(i=0;i<4;i++)
//		{
//			System.out.print(a[i]+"\t");
//		}
		
		int a[]=new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the array elements :");
		for(i=0;i<5;i++)
		{
			a[i] =sc.nextInt();
		}
		
		System.out.println("array is : ");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
		

	}

}

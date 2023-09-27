package Array;

import java.util.Scanner;

public class twoDarray {

	public static void main(String[] args) {
		
		
//		int a[][]= {{2,3,5},{3,6,8},{1,2,3}};
//		
//		int i, j;
//		for(i=0;i<3;i++)
//		{
//			for(j=0;j<3;j++)
//			{
//				System.out.print("\t"+a[i][j]);
//			}
//			
//			System.out.println();
//		}
		
		
		int a[][]= new int[3][3];
		int i,j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the array elements ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\t"+a[i][j]);
			}
			
			System.out.println();
		}
		

	}

}

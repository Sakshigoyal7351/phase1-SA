package Array;

import java.util.Scanner;

public class sum_of_array {

	public static void main(String[] args) {
		
		int n,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the total number of elements ");
		n=sc.nextInt();
		
		int a[] = new int[n];
		int b[]= new int[n];
		int c[]= new int[n];
		
		System.out.println("enter the elements of first array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the elements of Second array: ");
		for(i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			c[i]=a[i]+b[i];
		}
		
		System.out.println("sum of array a and b is :");
		for(i=0;i<n;i++)
		{
			System.out.println(c[i]);
		}

	}

}

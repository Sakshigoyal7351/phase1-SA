package Array;

public class Average_of_array {

	public static void main(String[] args) {
		int a[]= {90,80,90,80,90};
		int sum=0;
		double avg;
		int i;
		
		for(i=0;i<5;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of an array is : "+sum);
		
		avg=sum/5;
		
		System.out.println("average : "+avg);
	}

}

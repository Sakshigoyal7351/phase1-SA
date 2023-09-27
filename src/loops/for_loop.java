package loops;

public class for_loop {

	public static void main(String[] args) {

		int i;
		int sum=0;
		
		
//		for(i=1;i<=100;i++)
//		{
//			System.out.println(i);
//		}
		
		for(i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				
				sum=sum+i;
			}
		}
		
		System.out.println("sum ="+sum);
		

	}

}

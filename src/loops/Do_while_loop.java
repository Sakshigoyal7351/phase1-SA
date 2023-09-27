package loops;

public class Do_while_loop {

	public static void main(String[] args) {
		
		int i;
		int sum=0;
//		i=1;
//		do
//		{
//			System.out.println(i);
//			i++;
//		}
//		while(i<=100);
		
		i=1;
		do
		{
			System.out.println(i);
			sum=sum+i;
			i++;
		}
		while(i<=100);
		System.out.println("sum ="+sum);
	}

}

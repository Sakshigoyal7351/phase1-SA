package loops;

public class while_loop {

	public static void main(String[] args) {
		int i;
		int sum=0;
//		i=1;
//		while(i<=100)
//		{
//			System.out.println(i);
//			i++;
//		}
		
		i=1;
		while(i<=100)
		{
			sum=sum+i;
			System.out.println(i);
			i++;
		}
		
		System.out.println("sum "+sum);

	}

}

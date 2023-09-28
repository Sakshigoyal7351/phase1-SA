package Strings;

public class p2_check_vowel_constant {

	public static void main(String[] args) {
		
		String s="SimpliLearN";
		int v=0;
		int c=0;
		
		s =s.toLowerCase();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				v++;
			}
			else
			{
				c++;
			}
		}
		
		
		System.out.println("vowels are: "+v);
		System.out.println("constants are"+c);

	}

}

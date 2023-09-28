package Strings;

public class p1 {

	public static void main(String[] args) {
		
		String str="Simplilearn";
		
		String str2=new String("king");
		System.out.println(str);
		
		System.out.println(str2);
		
		String str3 = str.concat(str2);
		
		System.out.println(str3);
		
		
		System.out.println(str.length());
		
		System.out.println("Java".compareTo("Java"));
		
		String a="hii";
		String b="";
		
		System.out.println(a.isEmpty());
		System.out.println(b.isEmpty());
		
		System.out.println(a.charAt(2));
		
		String c="Hi EveRyOnE";
		
		System.out.println(c.toUpperCase());
		System.out.println(c.toLowerCase());
		
		System.out.println(c.repeat(3));
		
		
	}

}

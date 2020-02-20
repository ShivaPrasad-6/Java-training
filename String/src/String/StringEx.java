package String;

public class StringEx {
	String s1="Hello@World";
	String s2= "World";
	public static void main(String [] args) {
		
		StringEx s=new StringEx();
		System.out.println(s.s1.compareTo(s.s2));
		System.out.println(s.s1.concat(s.s2));
		System.out.println(s.s1.contentEquals(s.s2));
	  //System.out.println(s.s1.split("",2));
		System.out.println(s.s1.length());
		System.out.println(s.s2.replace("World","Hello"));
		System.out.println(s.s2);
	}
}

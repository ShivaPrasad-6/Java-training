package String;


public class StringComp {
	/*
	 * String s1 = "Hello World"; String s2 = "Bye World"; String s3 = "Welcome";
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c1 = {'s','h','i','v','a'};
		String s= new String(c1);
		char[] c2 = {'s','h','i','v','A'};
	  	String s1= new String(c2);
		//System.out.println(s.s1.charAt(0));
		int i= s.length();
		int j= s1.length();
		int c=0;
		if( i == j ) {
			for(int a=0; a<i;a++){
				for(int b=0;b< j;b++){
					if(c1[a] == c2[b]){
						//a++;
						//b++;
						c++;
					} 
				}
			}
		}
		if(c== i)
			System.out.println("equal");
		else
			System.out.println("not equal");
	}
}


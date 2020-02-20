package String;
import java.util.*;

public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 155,b=219;
		/*
		 * for(char i= 'A' ;i < 'N' ; i++) { char q=(char) ((char)a-i);
		 * System.out.println(""+q); }
		 */
		 char alpha,beta;
		 Scanner s=new Scanner(System.in);
		 alpha = s.next().charAt(0);
		 beta = s.next().charAt(0);
		if ((int)alpha < 78 ) {  
			System.out.println((char) ((char)a-alpha));
		}
		if ((int)beta < 110 ) {  
			System.out.println((char) ((char)b-beta));
		}
	}
}

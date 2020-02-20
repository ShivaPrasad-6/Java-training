package String;
import java.io.*;  
public class IoStreamEx {

	public static void main(String[] args) {
			try {
				BufferedReader br=new BufferedReader(new FileReader("D:\\testout.txt"));
				StringBuilder sb=new StringBuilder();
				while(br.readLine()!= null) {
					sb.append(br.readLine());
					
					br.readLine();
				}
				String p=sb.toString();
				System.out.println(p);	
			}
			catch(Exception e) {
				System.out.println(e);
			}
      }    
}


package String;
import java.util.*;
public class CollectionInf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> e=new ArrayList<String>();
		e.add("a");
		e.add("c");
		System.out.println(e);
		List<String> e1=new ArrayList<String>();
		e1.add("b");
		e1.add("d");
		System.out.println(e1);
		e.addAll(e1);
		System.out.println(e);
		//e.clear();
		//System.out.println(e);
		for(Object o:e ) {
			System.out.print(o);
		}
	}
}

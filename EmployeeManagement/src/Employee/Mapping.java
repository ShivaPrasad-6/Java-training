package Employee;
import java.util.*;
public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m=new HashMap();
		m.put(1, "s");
		m.put(2, "h");
		m.put(3, "i");
		m.put(4, "v");
		m.put(5, "a");
		Set s=m.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry entry= (Map.Entry) i.next();
			System.out.println(""+entry.getKey()+""+ entry.getValue());
			}
	}

}




package Employee;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee(1,"Shyamala",200000,"Chennai",new Address(123,123,"sadist tanda"));
		//System.out.println(e);
		Employee e1=new Employee(2,"Shiva",200000,"Chennai",new Address(132,132,"Shollinga"));
		//System.out.println(e1);
		Wages w=new Wages(1, "shiva", 20000, "chennai", 12, 10,new Address(123,123,"sadist"));
		//System.out.println(w.calWages());
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(e);
		a1.add(e1);
		//a1.add(new Employee(1,"Shyamala",200000,"Chennai",new Address(123,123,"sadist tanda")));
		//a1.add(new Employee(2,"Shiva",200000,"Chennai",new Address(132,132,"Shollinga")));
		//System.out.println(a1);
		Collections.sort(a1);
		for(Employee b:a1) {
			System.out.println(b.empId);
		}
	
	}

}

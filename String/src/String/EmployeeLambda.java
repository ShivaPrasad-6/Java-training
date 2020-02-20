package String;
import java.util.*;
import java.util.stream.Stream;

public class EmployeeLambda {
		 int empId;
		 String empName;
		 float empSalary;
		 public EmployeeLambda(int empId, String empName, float empSalary) {
			 super();
			 this.empId = empId;
			 this.empName = empName;
			 this.empSalary = empSalary;
		 }
		 public static void main(String[] args) {
		 // TODO Auto-generated method stub
			 ArrayList<EmployeeLambda> l=new ArrayList<EmployeeLambda>();
			 //Adding elements to map
			 l.add(new EmployeeLambda(1,"vaishu",100000f));
			 l.add(new EmployeeLambda(5,"usha",75000f));
			 l.add(new EmployeeLambda(2,"shiva",115000f));
			 l.add(new EmployeeLambda(4,"shyamu",100500f));
			 l.add(new EmployeeLambda(3, "venky",200000f));
			 /*//Traversing Map
			 Set set=map.entrySet();//Converting to Set so that we can traverse
			 Iterator itr=set.iterator();
			 while(itr.hasNext()){
		     //Converting to Map.Entry so that we can get key and value separately
		     Map.Entry entry=(Map.Entry)itr.next();
		     System.out.println(entry.getKey()+" "+entry.getValue());
		   }*/
			 Stream<EmployeeLambda> filtered_data = l.stream().filter(e -> e.empSalary == 100500 );
			 filtered_data.forEach( EmployeeLambda -> System.out.println(EmployeeLambda.empName+":"+EmployeeLambda.empSalary) );
	}
}

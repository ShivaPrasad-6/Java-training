package Employee;
import java.util.*;

public class Employee implements Comparable<Employee> {
	int empId;
	String empName;
	int salary;
	String location;
	Address adrs;
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", location=" + location
				+ ", adrs=" + adrs + "]";
	}

	
	public Address getAdrs() {
		return adrs;
	}

	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}
	
	public Employee(int empId, String empName, int salary, String location,Address adrs) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.location = location;
		this.adrs=adrs;
	}

	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		
		return this.empId-e.empId;
	}
	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		Employee e=new Employee(1,"Shyamal",200000,"Chennai");
		System.out.println(""+e.empId +"" +e.empName +""+e.salary +""+e.location);
		Employee e1=new Employee(2,"Shiva",200000,"Chennai");
		System.out.println(""+e1.empId +"" +e1.empName +""+e1.salary +""+e1.location);*/
	}
}

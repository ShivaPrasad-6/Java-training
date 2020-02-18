package Employee;
import java.util.*;
public class ComparatorExm implements Comparator<ComparatorExm> {
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	int empId,age;
	String eName;
	
	public ComparatorExm(int empId, int age, String eName) {
		super();
		this.empId = empId;
		this.age = age;
		this.eName = eName;
	}

	@Override
	public String toString() {
		return "ComparatorExm [empId=" + empId + ", age=" + age + ", eName=" + eName + "]";
	}
	public int compare(ComparatorExm o, ComparatorExm o1) {
		ComparatorExm e1=(ComparatorExm)o;
		ComparatorExm e2=(ComparatorExm)o1;
		if(e1.age==e2.age)
			return 0;
		else if(e1.age>e2.age)
			return 1;
		else
			return -1;
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparatorExm c1= new ComparatorExm(1,22,"Shiva");
		ComparatorExm c2 = new ComparatorExm(2,23,"prasad");
		ComparatorExm c3 = new ComparatorExm(3,24,"Shyamala");
		ComparatorExm c4= new ComparatorExm(4,25,"apoorva");
		ArrayList<ComparatorExm> a1=new ArrayList<ComparatorExm>();
		a1.add(c1);
		a1.add(c2);
		a1.add(c3);
		a1.add(c4);
	}

}

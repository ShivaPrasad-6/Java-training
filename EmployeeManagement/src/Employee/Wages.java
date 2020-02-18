package Employee;

public class Wages extends Employee {
	int number,hours;


	@Override
	public String toString() {
		return "Wages [number=" + number + ", hours=" + hours + ", empId=" + empId + ", empName=" + empName
				+ ", salary=" + salary + ", location=" + location + ", adrs=" + adrs + "]";
	}

	public int getNumber() {
		return (int) number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getHours() {
		return (int) hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}


	public Wages(int empId, String empName, int salary, String location, int number, int hours,Address adrs) {
		super(empId, empName, salary, location,adrs);
		this.number = number;
		this.hours = hours;
		this.adrs=adrs;
	}
	int calWages() {
		return  salary*number*hours;
	}
	public static void main(String[] args) { 

}
}

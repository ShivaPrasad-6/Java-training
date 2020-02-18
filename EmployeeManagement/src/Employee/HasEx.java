package Employee;
class Engine{
	int engNo,age;
	String engModel;
	String fuelType;
	
	
	@Override
	public String toString() {
		return "Engine [engNo=" + engNo + ", age=" + age + ", engModel=" + engModel + ", fuelType=" + fuelType + "]";
	}
	

	public Engine(int engNo, int age, String engModel, String fuelType) {
		super();
		this.engNo = engNo;
		this.age = age;
		this.engModel = engModel;
		this.fuelType = fuelType;
	}
	
	
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getEngNo() {
		return engNo;
	}
	public void setEngNo(int engNo) {
		this.engNo = engNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEngModel() {
		return engModel;
	}
	public void setEngModel(String engModel) {
		this.engModel = engModel;
	}
	
}

class Car{
	Engine e;
	int carNo;
	String carModel;
	
	
	@Override
	public String toString() {
		return "Car [e=" + e + ", carNo=" + carNo + ", carModel=" + carModel + "]";
	}
	
	
	public Car(Engine e, int carNo, String carModel) {
		super();
		this.e = e;
		this.carNo = carNo;
		this.carModel = carModel;
	}
	
	
	
	
	
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
}



public class HasEx {
	public static void main(String [] args) {	
		Car c=new  Car(new Engine(123,5,"e500d","petrol"),12345,"audi");
	System.out.println(c);
	}
}

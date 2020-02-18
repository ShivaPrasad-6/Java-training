package Automobile;

abstract public class Automobile {
	int modelNo;
	String modelName;
	public void getModelNo() {
		System.out.println(modelNo);
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public void getModelName() {
		System.out.println(modelName);
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	int show() {
		return 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

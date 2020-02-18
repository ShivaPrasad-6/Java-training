package Employee;

public class Address {
	int pinCode,hoseNo;
	String lanmark;
	
	
	@Override
	public String toString() {
		return "Address [pinCode=" + pinCode + ", hoseNo=" + hoseNo + ", lanmark=" + lanmark + "]";
	}


	public Address(int pinCode, int hoseNo, String lanmark) {
		super();
		this.pinCode = pinCode;
		this.hoseNo = hoseNo;
		this.lanmark = lanmark;
	}

	
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public int getHoseNo() {
		return hoseNo;
	}
	public void setHoseNo(int hoseNo) {
		this.hoseNo = hoseNo;
	}
	public String getLanmark() {
		return lanmark;
	}
	public void setLanmark(String lanmark) {
		this.lanmark = lanmark;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

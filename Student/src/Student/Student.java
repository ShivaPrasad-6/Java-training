package Student;

public class Student {
	int stId,crseId,phNo;
	String sName,gender;
	
	@Override
	public String toString() {
		return "Student [stId=" + stId + ", crseId=" + crseId + ", phNo=" + phNo + ", sName=" + sName + ", gender="
				+ gender + "]";
	}
	

	public void setStu(int stId,int crseId,int phNo,String sName,String gender) {
		this.stId = stId;
		this.gender = gender;
		this.sName = sName;
		this.phNo = phNo;
		this.crseId = crseId;
	}

	public int getStu() {
		System.out.println(stId);
		System.out.println(crseId);
		System.out.println(phNo);
		System.out.println(sName);
		System.out.println(gender);
	}

	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

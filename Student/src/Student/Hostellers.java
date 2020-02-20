package Student;

public class Hostellers extends Student{
	
	int rmNo;
	String pgName;
	@Override
	public String toString() {
		return "Hostellers [rmNo=" + rmNo + ", pgName=" + pgName + ", stId=" + stId + ", crseId=" + crseId + ", phNo="
				+ phNo + ", sName=" + sName + ", gender=" + gender + "]";
	}

	public int getRmNo() {
		return rmNo;
	}

	public void setRmNo(int rmNo) {
		this.rmNo = rmNo;
	}

	public String getPgName() {
		return pgName;
	}

	public void setPgName(String pgName) {
		this.pgName = pgName;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

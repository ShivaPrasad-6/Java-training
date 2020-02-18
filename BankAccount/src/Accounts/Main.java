package Accounts;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account x=new Account();
		 x.setAcnt(123,"abc","Savings");
		 x.getAcnt();
		 AcntSelect b=new AcntSelect();
		 b.updateAcntSelect(x);
		 Account x1=new Account();
		 x1.setAcnt(12,"ab","Current");
		 x1.getAcnt();
		 b.updateAcntSelect(x1);
	}
}

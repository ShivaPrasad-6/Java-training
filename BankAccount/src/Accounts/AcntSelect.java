package Accounts;

public class AcntSelect {
	public void updateAcntSelect(Account x) {
		if(x.acType.equals("Savings")){
		  //System.out.println("savings acount");
		  SavAcnt sav=new SavAcnt();
		  sav.setBal(20000);
		  sav.getBal();
		  sav.setDepBal(5000);
		  sav.getDepBal();
		  sav.setWithDrawl(10000);
		  sav.getWithDrawl();
	}
	else if(x.acType.equals("Current")){
		  CurAcnt cur=new CurAcnt();
		  cur.setBal(30000);
		  cur.getBal();
		  cur.setDepBal(5000);
		  cur.getDepBal();
		  //cur.deposit();
		  cur.setWithDrawl(34500);
		  //cur.withDrawl();
		  cur.getWithDrawl();
		  cur.updBal();
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

package Accounts;

public class SavAcnt extends Account {
	static int bal;
	int depBal;
	int withDrawl;

	@Override
	public String toString() {
		return "SavAcnt [depBal=" + depBal + ", withDrawl=" + withDrawl + ", acntNum=" + acntNum + ", CstName="
				+ cstName + ", acType=" + acType + "]";
	}

	public void getDepBal() {
		System.out.println(depBal);
		bal += depBal;
		System.out.println(bal);
		float c = bal + (bal * 0.1f);
		System.out.println(c);
	}

	public void setDepBal(int depBal) {
		this.depBal = depBal;
	}
	
	public void getWithDrawl() {
		System.out.println(withDrawl);
		bal -= withDrawl;
		float w = bal + (bal * 0.1f);
		System.out.println(w);
	}

	public void setWithDrawl(int withDrawl) {

		this.withDrawl = withDrawl;

	}

	public static void getBal() {
		System.out.println(bal);
	}
	
	public static void setBal(int bal) {
		SavAcnt.bal = bal;
	}

	/*
	 * 
	 * void deposit() { bal+=depBal; System.out.println(bal); float c=
	 * 
	 * bal+(bal*0.1f); System.out.println(c); } void withDrawl() { bal-=withDrawl;
	 * 
	 * float w= bal+(bal*0.1f); System.out.println(w); }
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

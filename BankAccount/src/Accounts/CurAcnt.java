package Accounts;

public class CurAcnt extends Account{
	final int minBal=1000,penalty=100;

	 static int bal;

	 int depBal,withDrawl;

	 public void getDepBal() {
	 System.out.println(depBal);
	 bal+=depBal;
	 System.out.println(bal);
	 float a= bal+(bal*0.1f);
	 System.out.println(a);
	 }

	 public void setDepBal(int depBal) {
	 this.depBal = depBal;
	 }

	 public void getWithDrawl() {
	 System.out.println(withDrawl);
	 bal-=withDrawl;
	 System.out.println(bal);
	 float b= bal+(bal*0.1f);
	 System.out.println(b);
	 
	 }

	 public void setWithDrawl(int withDrawl) {
	 this.withDrawl = withDrawl;
	 }

	 @Override
	 public String toString() {
	 return "CurAcnt [minBal=" + minBal + ", penalty=" + penalty + ", depBal=" + depBal + ", withDrawl=" + withDrawl
	  + ", acntNum=" + acntNum + ", cstName=" + cstName + ", acType=" + acType + "]";
	 }
	 
	 public static void getBal() {
		 System.out.println(bal);
	 }

	 public static void setBal(int bal) {
	 CurAcnt.bal = bal;
	 }
	 
	/*
	 * void deposit() { bal+=depBal; System.out.println(bal); float a=
	 * bal+(bal*0.1f); System.out.println(a); }
	 * 
	 * void withDrawl() { bal-=withDrawl; System.out.println(bal); float b=
	 * bal+(bal*0.1f); System.out.println(b); }
	 */

	 void updBal() {
	 if(bal<minBal) {
	  bal-=penalty;
	 }
	 System.out.println(bal);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

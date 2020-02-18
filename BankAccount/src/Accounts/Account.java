package Accounts;
public class Account {
	int acntNum;
	String cstName,acType;
	
	@Override
	public String toString(){
		return "Account [acntNum=" + acntNum + ", CstName=" + cstName + ", acType=" + acType + "]";
	}

	public void getAcnt() {
		System.out.println(""+acntNum +" "+cstName+" "+acType);
	}

	public void setAcnt(int acntNum,String cstName,String acType) {
		this.acntNum = acntNum;
		this.cstName=cstName;
		this.acType=acType;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

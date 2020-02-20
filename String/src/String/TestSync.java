package String;

class Table{  
	 synchronized void printTable(int n){//synchronized method  
	   for(int i=1;i<=5;i++){  
	     System.out.print(" "+n*i);  
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
	  
	 }  
	}  
	  
	public class TestSync{  
	public static void main(String args[]){  
	Table obj = new Table();//only one object  
	  
	Thread t1=new Thread(){  
	public void run(){  
	obj.printTable(5);  
	}  
	};  
	Thread t2=new Thread(){  
	public void run(){  
	obj.printTable(100);  
	}  
	};  
	  
	t1.start();  
	t2.start();  
	}  
	}  
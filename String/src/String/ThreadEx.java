package String;

class MyThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(" "+i);
		}
	}
}
class MyThread1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=11;i<=20;i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(" "+ i);
		}
	}
}

public class ThreadEx{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyThread m=new MyThread();
			MyThread1 m1=new MyThread1();
			m.start();
			m1.start();
			//Thread t=new Thread(m);
			//t.start();
			
	}

}

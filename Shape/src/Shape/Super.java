package Shape;

class A {
	A(int a,int b,int c){
		System.out.println("Super()");
	}
}
class B extends A{
	B(int a,int b,int c){
		super(a,b,c);
		System.out.println("B()");
	}
}
class Super{
	public static void main(String[] args) {
		A s=new A();
		B b=new B();
	}
}

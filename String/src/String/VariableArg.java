package String;

public class VariableArg {
	static void Add(int... values) {
		int sum=0;
		for(int add:values) {
			sum+=add;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Add(2,3);
			Add(5,6,7);
			Add(9,0);
	}

}

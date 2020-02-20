package String;
public class AddCount {
	static int c = 0, n;
	int Adcount(int n) {
		int r = 0, s = 0;
		if (n > 9) {
			int x = n;
			while (x > 0) {
				r = x % 10;
				s = s + r;
				x /= 10;
			}
			c++;
			Adcount(s);
		}
		return c;
	}
	public static void main(String[] args) {
		AddCount a = new AddCount();
		int p = a.Adcount(56729);
		System.out.println("returned value" + p);

	}
}

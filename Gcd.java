public class Gcd {

	
	static int gcd(int a, int b) {
		int gcd = 0;
		
		for(int i = 1; i <= a; i++) {
			if(a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}


	static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

	public static void main(String[] args) {
		int a = 12, b = 18;

		System.out.println(gcd(a, b));
		System.out.println(lcm(a, b));
	}
}
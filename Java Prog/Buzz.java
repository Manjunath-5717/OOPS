public class Buzz {

	static boolean buzz(int num) {
		int digit=num%10;
		
		if(digit==7 || num%7==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		if(buzz(81)){
			System.out.println("buzz");
		}else {
			System.out.println("not buzz");
		}
	}
	
}

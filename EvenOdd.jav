import java.util.Scanner;
public class EvenOdd {

	static String evenOdd(int num) {
	if(num%2==0) {
		return "even";
	}
	return "odd";
	}
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the numbers");
     System.out.println(evenOdd(sc.nextInt()));
	}

}

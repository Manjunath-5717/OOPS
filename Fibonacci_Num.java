import java.util.Scanner;
public class Fibonacci_Num {
	
	static void fi(int num) {
		int first=0;
		int second=1;
		for(int i=1;i<=num;i++) {
		System.out.println(first);
		int next=first+second;
		first=second;
		second=next;
		
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("the range:");
		int num=sc.nextInt();
		fi(num);
		

	}

}

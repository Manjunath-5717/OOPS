import java.util.Scanner;


public class StrongNUm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int original=n;
		int sum=0;
		while(n!=0) {
			int digit=n%10;
			
			int fact=1;
			for(int i=1;i<=digit;i++) {
			  fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}if(original==sum) {
			System.out.println(original +" it is a strong number ");
			
		}else {
			System.out.println(original +" it is not a strong number");
		}
		
	 
	 

	}

}

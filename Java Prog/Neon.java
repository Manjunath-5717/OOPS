public class Neon {

static boolean isneon(int num) {
	int sqr=num*num;
	int sum=0;
	while(sqr!=0) {
		int digit=sqr%10;
		sum=sum+digit;
		sqr=sqr/10;
	}
	return sum==num;
}
public static void main(String[] args) {
	
	if(isneon(9)) {
		System.out.println("it is a neon number");
	}else {
		System.out.println("it is not a neon number");
	}
	
}
}

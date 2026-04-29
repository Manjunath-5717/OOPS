public class Oddindexsum {

	static int oddArray(int [] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==1) {   //i%2 !==0
				sum=sum+a[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
        System.out.println("main method starts");
		int [] a= {10,18,7,14};
		
		int res=oddArray(a);
		System.out.println(res);
    
	}
}

public class SumofN {
	
	static double sumof(double n) {
		double count=0;
		while(n!=0){
			
			int digit=n%100;
            count++;
            n=n/10;
		}
		return count;
	}

	public static void main(String[] args) {
	 double n=	sumof(4.56);
     System.out.println(n);
	}
}
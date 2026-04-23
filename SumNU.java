public class SumNU {
    
    static int countt(int num){
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;

        }
        return sum;
    }
    public static void main(String[] args) {
        int n=countt(145);
        System.out.println(n);
    }
}

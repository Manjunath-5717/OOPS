public class Oddsumm {
    public static int oddadd(int num){
        int sum=0;
        while(num!=0){
            int digit=num%10;
            if(num%2==1){
                sum=sum+digit;
            }num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(oddadd(1234));
    }
}

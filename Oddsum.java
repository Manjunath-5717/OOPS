public class Oddsum {
    
    static int odd(int num){
        int sum=0;
        while(num!=0){
            int digit=num%10;
            if(digit%2==1){
                sum=sum+digit;

            }
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(odd(12465));
    }
}

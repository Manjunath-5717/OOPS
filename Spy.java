public class Spy{
    static boolean spy(int num){
     int sum=0;
     int pow=1;
     while(num!=0){
        int digit=num%10;
        sum=sum+digit;
        pow=pow*digit;
        num=num/10;
     }
     return pow==sum;
    }
    public static void main(String[] args) {
        if(spy(1124)){
            System.out.println("it is a spy number");
        }else{
            System.out.println("it is not a spy number");
        }
    }

}

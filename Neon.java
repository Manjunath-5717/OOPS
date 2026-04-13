public class Neon {
    static boolean neon(int num){
        int square=num*num;
        int sum=0;
        while(square!=0){
            int digit=square%10;
            sum=sum+digit;
            square=square/10;
        }
        return sum==num;
    }
    public static void main(String[] args) {
     if(neon(9)){
        System.out.println("it is a neon number");
     }else{
        System.out.println("not neon  number");
     }
    }
}

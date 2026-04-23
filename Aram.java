public class Aram{
    public static void main(String[] args) {
        int n=145;
        int original=n;
        int sum=0;

        while(n!=0){
            int digit=n%10;

            int fact=1;
            for(int i=1;i<=digit;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
           
        }
         
        if(original==sum){
            System.out.println("it is strong number");
        }else{
            System.out.println("it is not a strong number");
        }


    }
}
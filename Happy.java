public class Happy {
 public static void main(String[] args) {
    int n=19;
    if(n==1 ||n==7){
        System.out.println("it is a happy number");

    }else if(n>9){
        while(n>9){
            int sum=0;
            while(n!=0){
                int digit=n%10;
               sum=sum+digit*digit;
                n=n/10;
            }
                 n=sum;
        }
        if(n==1 || n==7){
            System.out.println("it is a happy number");
        }else{
            System.out.println("it is not a happy number");
        }
   
    }
    
 }
}
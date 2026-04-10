public class Empircal {

    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
           
        }
         return true;
    }
    static int reve(int num){
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int num=17;
        int reves=reve(num);
        System.out.println(num);
        if(isPrime(num) && isPrime(reves) &&num!=reves ){
            System.out.println(num +"it is an Emirp number");
        }else{
            System.out.println(num+"it is not a Emirp number");
        }
    }
}

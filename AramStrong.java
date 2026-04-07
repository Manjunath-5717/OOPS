public class AramStrong {
    public static void main(String[] args) {
        int n=153;
        int original=n;
        int sum=0;
        int count=0;

      int temp=n;
        while(temp!=0){
            count++;
            temp=temp/10;
            
        }

         temp=n;
        while(temp!=0){
            int digit=temp%10;

            int power=1;
            System.out.println("for the digit -> "+digit+" : tracing");
            for(int i=1;i<=count;i++){

                power=power*digit;
            }
            System.out.println("powers("+digit+") = "+power);
            System.out.println("adding power -> "+ power+" to sum -> "+sum+"+"+digit);
            sum=sum+power;
            System.out.println("sum = "+sum);
            temp=temp/10;
        }
        if(original==sum){
            System.out.println("it is a AramStrongNumber");

        }else{
            System.out.println("it is not a AramStrong Number");
        }
    }
}

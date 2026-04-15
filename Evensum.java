public class Evensum {
    
    static int even(int num){
          int sum=0;
        while(num!=0){
          
            int digit=num%10;
           if(digit%2==0){
            sum=sum+digit;
              
           }
         num=num/10;
        }
        return sum;
        
    }
    public static void main(String[] args) {
        System.out.println(even(12465));
    }
}

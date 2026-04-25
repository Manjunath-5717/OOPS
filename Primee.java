
public class Primee {
    public static void main(String[] args) {
       
       int num=11;
        int count=0;
        for(int i=1;i<=10;i++){
            if(num%i==0){
            count++;
            }
        }
        if(count==2){
            System.out.println("it is a prime number");
        }else{
            System.out.println("it is not a prime number");
        }
    }
}

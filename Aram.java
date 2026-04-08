public class Aram{
    public static void main(String[] args) {
        int n=153;
        int original=n; 
        int count=0;
        int sum=0;
        int temp=n;

        while(temp!=0){
            count++;
            temp=temp/10;
        }
        temp=n;

        while(temp!=0){  //153
            int digit=temp%10; //3,2,1
             
            int power=1;
            for(int i=1;i<=3;i++){
                power=power*digit;//27+125+1
            }
            sum=sum+power;//27+125+1=153
            temp=temp/10; //1
            
        }
        if(sum==original){
            System.out.println("AramStrong NUmber");
        }else{
            System.out.println("it is not a AramStrong Number");
        }
    }
    
}
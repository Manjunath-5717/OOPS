public class Avgsum {
    public static int avg(int num){
     int sum=0;
     int avg=0;
     int count=0;
     while(num!=0){
        int digit=num%10;
        count++;
        sum=sum+digit;
        avg=sum/count;
        num=num/10;
     }
     return avg;
    }

    public static void main(String[] args) {
        System.out.println(avg(154));
    }
}

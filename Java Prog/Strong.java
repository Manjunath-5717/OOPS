public class Strong {
    public static void main(String[] args) {

        int num = 153;
        int original = num;
        int sum = 0;
        int count=0;
        while(num !=0){
            num/=10;
            count++;
        }
        num = original;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + (int)Math.pow(digit,count);
            num = num / 10;
        }
System.out.println(sum);
        if (sum == original) {
            System.out.println(" is a Aramstrong Number");
        } else {
            System.out.println( " is not a AramStrong Number");
        }
    }
}
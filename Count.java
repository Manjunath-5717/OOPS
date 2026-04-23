public class Count {
    
    static int countt(int num){
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;

        }
        return count;
    }

    public static void main(String[] args) {
        int n=countt(134);
        System.out.println(n);
    }
}

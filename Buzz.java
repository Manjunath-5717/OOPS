public class Buzz {
    static boolean buzz(int num){
        int digit=num%10;
        if(num==7 || num%7==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        if(buzz(81)){
            System.out.println("it is a buzz number");
        }else{
            System.out.println("it is not a buzz number");
        }
    }
}

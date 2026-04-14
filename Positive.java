public class Positive{

    static String positive(int num){
        if(num>0){
            return "Positive Number";
        }else if(num<0){
            return "Negative Number";
        }else{
            return "Zero";
        }
    }
    public static void main(String[] args) {
        System.out.println(positive(4));
    }
}
public class Automorphic {
    static boolean automorphic(int num){
        int square=num*num;
        return(num%10==square%10);
    }
    public static void main(String[] args) {
        if(automorphic(25)){
            System.out.println("it is a automorphic number");
        }else{
            System.out.println("it is not a automorphic");
        }
    }
}

public class Exponent {
    
    static int expo(int base,int exponent){
        int power=1;
        for(int i=1;i<=3;i++){
            power=power*base;
        }
        return power;
    }
    public static void main(String[] args) {
        System.out.println(expo(2,3));
    }
}

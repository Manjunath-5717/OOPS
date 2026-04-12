public class SwapTW {
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        System.out.println(a+" "+b+" "+c);
        a=a+b+c;
        b=a-(b+c);
        c=a-(b+c);
        a=a-(b+c);
        System.out.println("After Swap");
        System.out.println(a+" "+b+" "+c);
    }
}

public class Happy {

    static String happy(int num) {

        while (true) {

            if (num == 1 || num == 7) {
                return "It is Happy Number";
            } else if (num < 10) {
                return "It is NOT Happy Number";
            }

            int sum = 0;

            while (num != 0) {
                int digit = num % 10;
                sum = sum + digit * digit;
                num = num / 10;
            }

            num = sum;
        }
    }

    public static void main(String[] args) {
        int n = 19;

        String result = happy(n);
        System.out.println(result);
    }
}
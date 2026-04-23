public class FibonacciSum {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1, next;

        int evenSum = 0;

        for (int i = 1; i <= n; i++) {
            if (a % 2 == 0) {
                evenSum =evenSum+a;
            }

            next = a + b;
            a = b;
            b = next;
        }

        System.out.println("Sum of Even Fibonacci numbers = " + evenSum);
    }
}
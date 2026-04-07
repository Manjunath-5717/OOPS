
public class ArrayMerge {
    public static void main(String[] args) {
        int[] a = {2, 3, 5};
        int[] b = {4, 6, 8};
        int[] c = new int[a.length + b.length];

        
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}
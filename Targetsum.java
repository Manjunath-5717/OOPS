public class Targetsum {

    public static int[] sumarr(int arr[]) {
        int target = 10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // after checking all pairs
    }

    public static void main(String[] args) {
        int[] res = {7, 2, 11, 8, 3};

        int[] ans = sumarr(res);

        System.out.println(ans[0] + " " + ans[1]);
    }
}
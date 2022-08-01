package shilpa.leetcode;

public class ClimbStairs {
    public static int climbStairs(int n) {
        int[] result = new int[n];
        if (n == 1) return 1;
        if (n == 2) return 2;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                result[0] = 1;
            } else if (i == 2) {
                result[1] = 2;
            } else {
                result[i - 1] = result[i - 2] + result[i - 3];
            }
        }

        return result[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(ClimbStairs.climbStairs(4));
    }
}


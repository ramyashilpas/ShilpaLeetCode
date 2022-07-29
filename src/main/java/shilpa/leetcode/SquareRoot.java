package shilpa.leetcode;

public class SquareRoot {
    public static int mySqrt(int x) {
        long y = 0;
        while(y*y <= x) y++;
        return (int)y-1;

    }

    public static void main(String[] args) {
        System.out.println(SquareRoot.mySqrt(4));
    }
}

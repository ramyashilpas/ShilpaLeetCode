package shilpa.leetcode;

public class ReverseBits {
    // you need treat n as an unsigned value
    public  static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int bit = (n >> i) & 1;
            result = result | (bit << (31 - i));
        }
        return result;
    }

    public static String toBinaryString(int n)
    {
        return String.format("%32s", Integer.toBinaryString(n))
                .replaceAll(" ", "0");
    }

    public static void main(String[] args)
    {
        int n = 43261596;

        System.out.println(n + " in binary is " + toBinaryString(n));
        System.out.println("On reversing bits " + toBinaryString(reverseBits(n)));
    }
}

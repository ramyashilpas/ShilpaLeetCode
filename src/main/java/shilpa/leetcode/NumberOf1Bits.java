package shilpa.leetcode;

public class NumberOf1Bits {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {

    int count=0;
    String s=toBinaryString(n);

        for(int i=0;i<s.length();i++){
            char c = s.toCharArray()[i];
            if(String.valueOf(c).equalsIgnoreCase( "1")) {
                count ++;
            }
        }
    return count;
    }
    public static String toBinaryString(int n)
    {
        return String.format("%32s", Integer.toBinaryString(n))
                .replaceAll(" ", "0");
    }
    public static void main(String[] args) {
       int n=11;
        System.out.println(NumberOf1Bits.hammingWeight(Integer.parseInt(String.valueOf(n))));
    }
}

package shilpa.leetcode;

import java.util.Arrays;

public class IncrementingLargeIntegerOfArray {
    /*Question-
    You are given a large integer represented as an integer array digits,
    where each digits[i] is the ith digit of the integer.
    The digits are ordered from most significant to least significant in left-to-right order.
    The large integer does not contain any leading 0's.

    Increment the large integer by one and return the resulting array of digits.
    * */
    public static int[] plusOne(int[] digits) {
        /*int[] result = new int[0];
        int actualVal = 0;
        for(int i=digits.length-1, multiplier=1; i>=0; i--, multiplier=multiplier*10) {
            actualVal = actualVal + digits[i]*multiplier;
        }

        actualVal++;

        String[] str = String.valueOf(actualVal).split("");
        result = new int[str.length];

        for(int i=0; i<result.length; i++) {
            result[i] = Integer.parseInt(str[i]);
        }*/

        int[] result = new int[digits.length+1];
        for (int i = digits.length - 1; i >= 0; i--) {
             if(digits[i]<9){
                 digits[i]++;
                 return digits;
             }
             digits[i]=0;
        }
           result[0]=1;
           return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9};
        int[] output = IncrementingLargeIntegerOfArray.plusOne(arr);
        String s = Arrays.toString(Arrays.stream(output).toArray());
        System.out.println(s);

    }
}

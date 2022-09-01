package shilpa.leetcode;

import java.util.*;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
       Arrays.sort(nums);
     return nums[nums.length/2];
    }

    public static void main(String[] args) {
        int[] nums=new int[]{6,5,5};
        int res= MajorityElement.majorityElement(nums);
        System.out.println(res);

    }
}

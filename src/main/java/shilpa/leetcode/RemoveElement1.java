package shilpa.leetcode;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class RemoveElement1 {
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i=0;i<nums.length;i++)
            if(nums[i]!=val)
            {
                nums[index] = nums[i];
                index++;
            }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int val = 2;

        System.out.println(removeElement(arr, 2));
        //System.out.println(Arrays.toString(arr));

        int p=removeElement(arr, 2);

       // sort(arr, 0, p); // Sort the first k elements of nums
        for(int i=0;i<p;i++) {
            arr = Arrays.copyOfRange(arr, 0, p);
        }
        System.out.println(Arrays.toString(arr));

    }
}

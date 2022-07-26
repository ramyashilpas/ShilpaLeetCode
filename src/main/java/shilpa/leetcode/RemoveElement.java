package shilpa.leetcode;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        int lastIndex = nums.length - 1;
        int temp;

        for (int i = 0; i < nums.length; i++) {
            if (val == nums[i]) {
                if (lastIndex > i) {
                    if (nums[lastIndex] == val) {
                        while (lastIndex >0 && nums[lastIndex] == val) {
                            lastIndex--;
                        }

                        if (val != nums[lastIndex] && lastIndex >i) {
                            temp = nums[i];
                            nums[i] = nums[lastIndex];
                            nums[lastIndex] = temp;
                        }
                    } else if (val != nums[lastIndex]) {
                        temp = nums[i];
                        nums[i] = nums[lastIndex];
                        nums[lastIndex] = temp;
                        lastIndex--;
                    }
                }
            }
        }

        for (int i =0; i<nums.length; i++) {
            if (nums[i] != val) {
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int p=removeElement(arr, val);
        System.out.println(p);

        int[] arr1 = {4,5};
        int val1 = 4;
        int p1=removeElement(arr1, val1);
        System.out.println(p1);

        int[] arr2 = {0,3,1,1,0,1,3,0,3,3,1,1};
        int val2 = 1;
        int p2=removeElement(arr2, val2);
        System.out.println(p2);

        int[] arr3={3,2,2,3};
        int val3=3;
        int p3=removeElement(arr3,val3);
        System.out.println(p3);

        int[] arr4 = {3,3};
        int val4 = 3;
        int p4=removeElement(arr4, val4);
        System.out.println(p4);

        int[] arr5 = {2,3,3};
        int val5 = 3;
        int p5=removeElement(arr5, val5);
        System.out.println(p5);
    }
}

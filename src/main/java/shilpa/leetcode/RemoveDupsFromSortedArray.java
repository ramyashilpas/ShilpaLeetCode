package shilpa.leetcode;

import java.util.*;

public class RemoveDupsFromSortedArray {
    public static void main(String[] args) {
        int[] array = {-3,-1,0,0,0,3,3};

        System.out.println(removeDuplicates(array));
    }

    public static int removeDuplicates(int[] nums) {
        Set myset = new HashSet();
        List mylist = new ArrayList<>();

        final int[] j = {0};
        for(int i=0; i<nums.length; i++) {
            myset.add(nums[i]);
        }

        mylist = Arrays.asList(myset.stream().toArray());
        Collections.sort(mylist);

        mylist.forEach(key -> {
            nums[j[0]++] = (int) key;
        });

        System.out.println(nums);
        return myset.size();
    }
}

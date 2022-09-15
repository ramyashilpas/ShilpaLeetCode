package shilpa.leetcode;

import java.util.HashMap;



public class ContainsDuplicatesII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if (hs.containsKey(nums[i])) {
                int result = i - hs.get(nums[i]);
                if (result <= k) {
                    return true;
                }
            }
            hs.put(nums[i],i);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] nums=new int[]{1,2,3,1};
        int k=3;
        boolean b = ContainsDuplicatesII.containsNearbyDuplicate(nums, k);
        System.out.println(b);
    }
}

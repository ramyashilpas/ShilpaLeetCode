package shilpa.leetcode;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                return i;
            }
        }
        return i;
    }

    public static void main(String[] args){
        int[] arr={1,3,5,6};
        int result= SearchInsertPosition.searchInsert(arr,2);
        System.out.println(result);
    }
}

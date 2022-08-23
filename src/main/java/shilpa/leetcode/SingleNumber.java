package shilpa.leetcode;

//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
    /* int singleNum=nums[0];
     for(int i=1;i<nums.length;i++){
      singleNum^=nums[i];
     }
     return singleNum;*/
        Arrays.sort(nums);
        if(nums.length<=1){
            return nums[0];
        }
        int i=0;
        while(i<nums.length-1){
            int j=i+1;
            if(nums[i]!=nums[j]){
                return nums[i];
            }
            i=j+1;
        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        int[] nums=new int[]{4,1,2,1,2};
       int value= SingleNumber.singleNumber(nums);
        System.out.println(value);
    }
}

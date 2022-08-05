package shilpa.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       /*
       int[] arr = new int[m+n];    // holds the result
        int k=0;
        // two pointers
        int i=0;  // pointing nums1
        int j=0;  // pointing nums2
        while(i<m && j<n){
            // below conditions are self explanatory
            if(nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];
            }
            else if(nums1[i] > nums2[j]) {
                arr[k++] = nums2[j++];
            }
            else {
                arr[k++] = nums1[i++];
                arr[k++] = nums2[j++];
            }
        }
        // put the remaining in the result array arr we created
        while(i<m) {
            arr[k++] = nums1[i++];
        }
        while(j<n) {
            arr[k++] = nums2[j++];
        }
        // replace the result values in nums1
        for(k=0;k<m+n;k++) {
            nums1[k] = arr[k];
        }
      }
        }*/

        List<Integer> list1 = Arrays.stream(Arrays.copyOfRange(nums1, 0, m)).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());

        list1.addAll(list2);
        Collections.sort(list1);

        AtomicInteger k = new AtomicInteger();
        list1.stream().forEach(item -> nums1[k.getAndIncrement()] = (int) item);
       /* for(int i=0; i<list1.size(); i++) {
            nums1[i] = list1.get(i);
        }*/
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] arr2 = {2, 5, 6};
        int n = 3;
        MergeSortedArrays.merge(arr1, m, arr2, n);
        System.out.println(Arrays.toString(arr1));
    }
}

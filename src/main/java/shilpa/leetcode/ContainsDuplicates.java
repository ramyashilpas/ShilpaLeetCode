package shilpa.leetcode;

import java.util.*;
//import java.util.concurrent.atomic.AtomicBoolean;
//import java.util.stream.Collectors;

public class ContainsDuplicates {
    public static boolean containsDuplicate(int[] nums) {
        /*Method1-to practice Streams topic:
        List<Integer> li = new ArrayList<>();
        AtomicBoolean returnVal = new AtomicBoolean(false);

        for (int num : nums) {
            li.add(num);
        }
        List<Object> numsList = Arrays.asList(li.stream().toArray());

        Map<String, Long> counterMap = (Map<String, Long>) numsList.stream().collect(Collectors.groupingBy(e -> e.toString(), Collectors.counting()));

        System.out.println(counterMap);

        counterMap.keySet().stream().forEach(key -> {
            if (counterMap.get(key) > 1) {
                returnVal.set(true);
            }
        });

        return returnVal.get();*/
        /*Method2- easy solution using hashMap*/
       /* HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i))return true;
            map.put(i,1);
        }
        return false;*/
        /*Method2- easy solution using hashset*/
        HashSet<Integer> hs=new HashSet<>();
        for (int num : nums) {
            if (hs.contains(num)) {
                return true;
            }
            hs.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 6};
        boolean b = ContainsDuplicates.containsDuplicate(nums);
        System.out.println(b);
    }
}

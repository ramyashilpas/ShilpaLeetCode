package shilpa.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class ContainsDuplicates {
    public static boolean containsDuplicate(int[] nums) {
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

        return returnVal.get();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 3};
        boolean b = ContainsDuplicates.containsDuplicate(nums);
        System.out.println(b);
    }
}

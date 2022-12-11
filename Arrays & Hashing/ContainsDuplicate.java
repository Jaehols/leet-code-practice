import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// 217 Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], "true");
            }
        }
        return false;
    }

    public static boolean containsDuplicateSolution(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])) {
                return true;
            } else {
                numbers.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,2};
        System.out.println(containsDuplicate(input));
    }
}


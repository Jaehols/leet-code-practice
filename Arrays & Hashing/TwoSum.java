import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        //Couldn't find the right solution


//        int[] original = nums;
//
//        Arrays.sort(nums);
//
//        Integer pointer1 = 0;
//        Integer pointer2 = nums.length - 1;
//
//        while (pointer1 < pointer2) {
//            Integer temp = nums[pointer1] + nums[pointer2];
//
//            if (temp == target) {
//                //if ()
//                return new int[] {arrayPlaces.get(nums[pointer1]), arrayPlaces.get(nums[pointer2])};
//            } else if (temp > target) {
//                pointer2--;
//            } else {
//                pointer1 ++;
//            }
//        }

        return null;
    }

    public int[] twoSumSolution(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(nums[i])) {
                return new int[] { prevMap.get(num), i };
            }

            prevMap.put(diff, i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int check;

        System.out.println(end);

        if (nums[start] == target) {
            return start;
        } else if (nums[end] == target) {
            return end;
        }

        while (start < end && (end - start) > 1) {
            System.out.println("Start is:" + start);
            System.out.println("End is:" + end);

            check = (int) Math.ceil((end - start) / 2) + start;
            System.out.println("Check is:" + check);
            if (nums[check] == target) {
                return check;
            } else if (nums[check] > target) {
                end = check;
            } else {
                start = check;
            }
        }
        return -1;
    }

    public static int searchSolution(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;

            if (nums[mid] == target) return mid; else if (
                    nums[mid] < target
            ) i = mid + 1; else j = mid - 1;
        }

        return -1;
    }

    public static void main(String args[]) {
        int[] array = {-1, 0, 5};
        int target = 5;

        search(array, target);
    }
}

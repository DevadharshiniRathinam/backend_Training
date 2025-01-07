package Day8;

public class Solution5 {
    public int[] nextGreaterElement(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = -1;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    result[i] = nums[j];
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        int[] nums = {4, 5, 2, 10};
        int[] result = solution.nextGreaterElement(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}


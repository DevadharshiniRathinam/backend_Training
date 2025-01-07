package Day8;
public class Solution3 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        int[] nums = {3, 0, 1};
        System.out.println(solution.missingNumber(nums));
    }
}


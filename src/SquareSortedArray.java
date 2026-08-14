public class SquareSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        Solution sol = new Solution();
        int[] result = sol.sortedSquares(nums);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1, position = n - 1;
        int[] result = new int[n];

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                result[position--] = leftSquare;
                left++;
            } else {
                result[position--] = rightSquare;
                right--;
            }
        }
        return result;
    }
}

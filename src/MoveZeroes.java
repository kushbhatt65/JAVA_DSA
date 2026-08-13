/*
 * LeetCode 283 - Move Zeroes
 * Topic: Two Pointers
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int update = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                int temp = nums[update];
                nums[update] = nums[i];
                nums[i] = temp;

                update++;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}
import java.util.HashSet;

public class DuplicateArray {



    // without hashing

//            // Example test case
//            int[] nums = {1, 2, 3, 1};
//            Solution sol = new Solution();
//            boolean result = sol.containsDuplicate(nums);
//            System.out.println(result); // Expected: true
//    class Solution {
//        public boolean containsDuplicate(int[] nums) {
//            // Brute force: check every pair
//            for (int i = 0; i < nums.length; i++) {
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (nums[i] == nums[j]) {
//                        return true; // duplicate found
//                    }
//                }
//            }
//            return false; // no duplicates
//        }
//    }

    public static void main(String[] args) {
        // Example test case
        int[] nums = {1, 2, 3, 1};
        Solution sol = new Solution();
        boolean result = sol.containsDuplicate(nums);
        System.out.println(result); // Expected: true
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true; // duplicate found
            }
            set.add(num);
        }
        return false; // no duplicates
    }
}

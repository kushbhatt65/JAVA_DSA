public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(countEvenDigitNumbers(nums));
    }
    static int countEvenDigitNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (hasEvenDigits(nums[i])) {
                count++;
            }
        }
        return count;
    }
    static boolean hasEvenDigits(int num) {
        int digits = 0;
        if (num < 0) {
            num = -num;
        }
        do {
            digits++;
            num = num / 10;
        } while (num > 0);
        return digits % 2 == 0;
    }
}

// LeetCode Version -- 
//class Solution {
//    public int findNumbers(int[] nums) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (hasEvenDigits(nums[i])) {
//                count++; 
 //            }
//        }
//        return count;
//    }
//    private boolean hasEvenDigits(int num) {
//        int digits = 0;
//        if (num < 0) {
//            num = -num;
//        }
//        do {
//            digits++;
//            num = num / 10;
//        } while (num > 0);
//
//        return digits % 2 == 0;
//    }
//}
// Binary Search ek searching technique hai jo har step me data ka aadha hissa discard kar deti hai…
// Binary search works only on sorted data (Array).
// Binary Search ek efficient searching technique hai jo sorted data par kaam karti hai.
// binary search ek searching algorithm hai jo sirf sorted array per kaam karta hai sorted array me element
// ko dhundhne ke liye use hoti hai ye middle element se comparision karke decide karti hai ki element left
// side m hai ya right side m hai aur har step m array aadha data discard ho jata hai is appraoch ki wajah
// se iski time complexity O(log n) hoti hai, jo ise linear search se zyada efficient banata hai.
// Binary Search is an efficient searching algorithm used to find an element in a sorted array or list.
//It works by repeatedly dividing the search space into two halves and comparing the target element with the
// middle element. Based on this comparison, one half of the data is eliminated in each step, which results in a
// time complexity of O(log n).


public class BinarySearch {
    static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12};
        int target = 10;
        int result = binarySearch(nums, target);
        System.out.println("Index: " + result);
    }
}

// Peak Index Mountain Array.
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;   // move right
            } else {
                right = mid;      // move left
            }
        }
        return left;
    }
}

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    private int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}

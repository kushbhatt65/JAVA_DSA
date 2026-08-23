// search for 3 in the range of index 1 to 4
// [18, 12, -7, 3, 14, 28]

public class SearchingInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;
        // Corrected method call
        System.out.println(SearchingInRange(arr, target, 1, 4));
    }

    static int SearchingInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            // Check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}

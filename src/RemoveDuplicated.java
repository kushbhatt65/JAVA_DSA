public class RemoveDuplicated {
    public static void main(String [] args) {
            int[] nums = {1,2,2,2,3,3,4,4,5,5};
            int low = 0;
            int high = 1;
            int update = 1;
            int n = nums.length;
            while (update < n ) {
                if (nums[update] == nums[update-1]) {
                    update++;
                    continue;
                }
                nums[low + 1] = nums[update];
                low++;
                high++;
                update++;
            }
        System.out.println(high);
            for (int i = 0; i<high; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }

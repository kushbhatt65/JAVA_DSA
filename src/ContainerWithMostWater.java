public class ContainerWithMostWater {
    public static void main(String[] args) {
        // Example input
        int[] height = {1,8,6,2,5,4,8,3,7};

        Solutions sol = new Solutions();
        int result = sol.maxArea(height);

        System.out.println("Maximum area: " + result);
    }
}

class Solutions {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}

//public class UpdateAnElement {
//    public static void main(String[] args) {
//        int[] arr = {11, 13, 44, 55, 66, 44};
//        int key = 13;
//        int newValue = 99;
//        boolean updated = false;
//
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] == key) {
//                arr[i] = newValue;   // update the value
//                updated = true;
//                break;               // stop after updating
//            }
//        }
//
//        if(updated) {
//            System.out.println("Array updated successfully!");
//        } else {
//            System.out.println("Element not found!");
//        }
//
//        // Print updated array
//        for(int num : arr) {
//            System.out.print(num + " ");
//        }
//    }
//}

public class UpdateAnElement {

    public static int maximumPopulation(int[][] logs) {

        int[] population = new int[101];

        // Difference array
        for (int[] log : logs) {

            int birth = log[0];
            int death = log[1];

            population[birth - 1950]++;
            population[death - 1950]--;
        }

        int current = 0;
        int max = 0;
        int answer = 1950;

        // Prefix sum
        for (int i = 0; i < population.length; i++) {

            current += population[i];

            if (current > max) {
                max = current;
                answer = i + 1950;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[][] logs = {
                {1993, 1999},
                {2000, 2010}
        };

        int result = maximumPopulation(logs);

        System.out.println("Maximum population year: " + result);
    }
}

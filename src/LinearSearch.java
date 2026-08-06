import java.util.*;

// Find the target value using Linear Search---
public class LinearSearch {
    public static void main (String[] args) {

// initializing array
        int[] arr  ={12,45,67,89,34};
        // taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target number: ");
        int input = sc.nextInt();

        int target = input;
        boolean found = false;
// visiting all the elements until target found.
        for(int i = 0; i< arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}

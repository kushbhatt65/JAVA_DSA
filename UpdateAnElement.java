public class UpdateAnElement {
    public static void main(String[] args) {
        int[] arr = {11, 13, 44, 55, 66, 44};
        int key = 13;
        int newValue = 99;
        boolean updated = false;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                arr[i] = newValue;   // update the value
                updated = true;
                break;               // stop after updating
            }
        }

        if(updated) {
            System.out.println("Array updated successfully!");
        } else {
            System.out.println("Element not found!");
        }

        // Print updated array
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}

public class MoreOfArray {
    public static void main(String [] args) {



        // print all the elements of array.
//        int[] arr = {11,22,33,44,55,66};
//
//        for (int i = 0; i<= arr.length-1; i++) {
//            System.out.print(arr[i] + " ");
//    }

//        print array in reverse order.
//        int[] arr = {11,22,33,44,55,66};
//
//        for (int i = arr.length-1; i>=0; i--) {
//            System.out.print(arr[i] + " ");
//        }


//        // sum of all elements of array.
//        int[] arr = {11,22,33,44,55,66};
//        int sum =0;
//        for (int i = 0; i <=arr.length-1; i++) {
//            int value = arr[i];
//            sum = sum + value;
//        }
//        System.out.print(sum);

        //find the average of array elements.
//        int[] arr = {11,22,33,44,55,66};
//        float sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//        }
//        float average = sum / arr.length;
//        System.out.println("Average = " + average);



        // Find the maximum element.
//        int[] arr = {11,22,33,44,55,66};
//        int max = arr[0];
//        for (int i = 0; i<arr.length; i++) {
//            if (arr[i]>max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);

//
//        // find the minimum value of the array.
//        int[] arr = {11,22,33,44,55,66};
//        int min = arr[0];
//        for (int i = 0; i<arr.length; i++) {
//         if (arr[i] < min) {
//             min = arr[i];
//         }
//        }
//        System.out.println(min);

        // perform linear search-
//        int[] arr = {11,22,33,44,55,66};
//        int key = 44;
//        boolean found = false;
//        for (int i = 0; i <arr.length; i++) {
//            if (arr[i] == key) {
//                System.out.println("Element found at index" + i);
//                found = true;
//                break;
//            }
//        }
//        if(!found) {
//            System.out.println("Element is not present in the array");
//        }


//        // updating an array element.
//
//        int[] arr = {11,22,33,44,55,66};
//        int key = 22;
//        int newValue = 99;
//        boolean updated = false;
//        for(int i = 0; i < arr.length; i++) {
//            if (arr[i] == key) {
//                arr[i] = newValue;
//                updated = true;
//                break;
//            }
//        }
//        if (updated) {
//            System.out.println("Array updated");
//        } else {
//            System.out.println("Array not updated");
//        }
//        for (int num : arr) {
//            System.out.print(num +  " ");
//        }


//        more polished way to replace element
//        int[] arr = {11,22,33,44,55,66};
//        int element = 555;
//        int index = 3;  // position where you want to replace
//        arr[index] = element;  // replace directly
//        System.out.println("Element replaced at index " + index);
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }

//        // insert an element at a given position.
//        int[] arr = {11,22,33,44,55,66};
//        int element = 555;
//        int index = 3; // position where we want to insert
//        // Step 1: Create new array with +1 size
//        int[] newArr = new int[arr.length + 1];
//        // Step 2: Copy elements before index
//        for (int i = 0; i < index; i++) {
//            newArr[i] = arr[i];
//        }
//        // Step 3: Insert new element at index
//        newArr[index] = element;
//        // Step 4: Copy remaining elements (shifted right)
//        for (int i = index; i < arr.length; i++) {
//            newArr[i + 1] = arr[i];
//        }
//        // Step 5: Print new array
//        for (int num : newArr) {
//            System.out.print(num + " ");
//        }

//              Delete an element at given index. 
                int[] arr = {11,22,33,44,55,66};
                int index = 3; // position to delete (element 44)
                // Step 1: Create new array with -1 size
                int[] newArr = new int[arr.length - 1];
                // Step 2: Copy elements before index
                for (int i = 0; i < index; i++) {
                    newArr[i] = arr[i];
                }
                // Step 3: Copy elements after index (shift left)
                for (int i = index + 1; i < arr.length; i++) {
                    newArr[i - 1] = arr[i];
                }
                // Step 4: Print new array
                for (int num : newArr) {
                    System.out.print(num + " ");
                }
            }
        }

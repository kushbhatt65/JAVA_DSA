import java.util.*;
public class MultiDimensionalArray {
    public static void main(String [] args) {
//        declaration
        int[][] arr;
//        allocation
        arr = new int [3][4];

//        initialzation
//        int [][] brr = {
//                {1,2},
//                {2,4},
//                {3,6},
//                {4,8}
//
//        };
////        System.out.println(brr[2][1]);
//        int rowLength = brr.length;
//        // only works when the column length is same
//        int colLength = brr[0].length;
//
//        for (int i = 0; i <=rowLength-1; i++) {
//            for (int j =0; j<= colLength-1; j++) {
//                System.out.print(brr[i][j] + " ");
//            }
//            System.out.println();
//        }



//       for Jaggeg Array
//        int [][] brr = {
//                {1,2},
//                {2,4,5,6,9},
//                {3,6,5,6},
//                {4,8}

//        };
//        int rowLength = brr.length;
//        // only works when the column lenght is same
//        for (int rowIndex = 0; rowIndex <=rowLength-1; rowIndex++) {
//            // Jaise hi main kisi nayi row m aaya, same point per mene us row ka colLength find kar liya
//            // current row -> brr[rowIndex]
//            // isme kitne columns -> brr[rowIndex].length
//            int colLength = brr[rowIndex].length;
//            for (int colIndex =0; colIndex<= colLength-1; colIndex++) {
//                System.out.print(brr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }
//
        // more optimized solution for any 2-D array travarsal.
//        for (int rowIndex = 0; rowIndex<= brr.length-1; rowIndex++) {
//            for(int colIndex = 0; colIndex< brr[rowIndex].length-1; colIndex++) {
//                System.out.print(brr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }

        // input for 2d array

        int crr[][] = new int [3][4];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i <= crr.length-1; i++){
            for (int j = 0; j<=crr.length-1; j++) {
                System.out.print("Provide Value for row " + i + " Provide value for col " + j );
                crr[i][j] = sc.nextInt();
            }
        }
                for (int rowIndex = 0; rowIndex<= crr.length-1; rowIndex++) {
            for(int colIndex = 0; colIndex< crr[rowIndex].length-1; colIndex++) {
                System.out.print(crr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
    }
}

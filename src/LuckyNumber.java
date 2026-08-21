import java.util.*;

class Sol {
    public List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Find minimum element of each row
        int[] rowMin = new int[rows];

        for (int i = 0; i < rows; i++) {
            rowMin[i] = matrix[i][0];

            for (int j = 1; j < cols; j++) {
                rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
            }
        }

        // Find maximum element of each column
        int[] colMax = new int[cols];

        for (int j = 0; j < cols; j++) {
            colMax[j] = matrix[0][j];

            for (int i = 1; i < rows; i++) {
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }
        }

        // Compare both
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == rowMin[i] &&
                        matrix[i][j] == colMax[j]) {

                    ans.add(matrix[i][j]);
                }
            }
        }

        return ans;
    }
}
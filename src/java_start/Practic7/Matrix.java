package java_start.Practic7;

/**
 * Created by Xepcoh on 10.09.2016.
 */
public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(5);
        printMatrix(matrix);

    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] createMatrix(int size) {
        int[][] arrayMatrix = new int [size][size];

        for (int i = 0; i<arrayMatrix.length; i++) {
            for (int j = 0; j<arrayMatrix[i].length; j++) {
                if (i==j || j == (arrayMatrix[i].length - 1 - i)) {
                    arrayMatrix[i][j] = 1;
                }
            }
        }

        return arrayMatrix;
    }
}

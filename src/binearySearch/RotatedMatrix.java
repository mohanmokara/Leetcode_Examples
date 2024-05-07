package binearySearch;

 
	 public class RotatedMatrix {
		    public static int[][] rotateMatrix(int[][] matrix) {
		        int rows = matrix.length;
		        int cols = matrix[0].length;

		        // Create a new matrix to store the rotated elements
		        int[][] rotatedMatrix = new int[cols][rows];

		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                rotatedMatrix[j][rows - 1 - i] = matrix[i][j];
		            }
		        }

		        return rotatedMatrix;
		    }

		    public static void printMatrix(int[][] matrix) {
		        for (int[] row : matrix) {
		            for (int num : row) {
		                System.out.print(num + " ");
		            }
		            System.out.println();
		        }
		    }

		    public static void main(String[] args) {
		        int[][] matrix1 = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };
		        System.out.println("Input Matrix:");
		        printMatrix(matrix1);

		        int[][] rotatedMatrix1 = rotateMatrix(matrix1);
		        System.out.println("Rotated Matrix:");
		        printMatrix(rotatedMatrix1);

		        int[][] matrix2 = {
		            {5, 1, 9, 11},
		            {2, 4, 8, 10},
		            {13, 3, 6, 7},
		            {15, 14, 12, 16}
		        };
		        System.out.println("Input Matrix:");
		        printMatrix(matrix2);

		        int[][] rotatedMatrix2 = rotateMatrix(matrix2);
		        System.out.println("Rotated Matrix:");
		        printMatrix(rotatedMatrix2);
		    }
		}

 
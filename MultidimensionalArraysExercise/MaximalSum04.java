package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;


public class MaximalSum04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[][] matrix = new int[N][M];
        fillMatrix(matrix, sc);

        int sum = 0;
        int startRow = 0;
        int startCol = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]
                        + matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2]
                        + matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
                if (maxSum < sum) {
                    maxSum = sum;
                    startRow = i;
                    startCol = j;
                }
            }
        }


        System.out.printf("Sum = %d%n", maxSum);
        printMatrix(matrix, startRow, startCol);


    }


    private static void printMatrix(int[][] matrix, int startRow, int startCol) {
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void fillMatrix(int[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }
}

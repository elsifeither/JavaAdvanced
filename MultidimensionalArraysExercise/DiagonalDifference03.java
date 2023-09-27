package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int [][]matrix = new int[n][n];


        fillMatrix(matrix,sc);
        int primaryDiagonal = getPrimaryDiagonal(matrix);
        int secondaryDiagonal = getPrimarySecondary(matrix);

        System.out.println(Math.abs(primaryDiagonal-secondaryDiagonal));






    }

    private static int getPrimarySecondary(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i==j) {
                    sum+= matrix[i][j];
                }
            }
        }
        return sum;
    }

    private static int getPrimaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == matrix[i].length - j - 1) {
                    sum+= matrix[i][j];
                }
            }
        }
        return sum;
    }

    private static void fillMatrix(int[][] matrix,Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
                matrix[i] = Arrays.stream(sc.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
            }
        }
    }


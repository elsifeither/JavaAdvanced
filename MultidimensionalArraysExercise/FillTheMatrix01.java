package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class FillTheMatrix01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tokens = sc.nextLine().split(", ");

        int n = Integer.parseInt(tokens[0]);
        String pattern = tokens[1];
        int[][] matrix = new int[n][n];

        switch (pattern) {

            case "A":
                int count = 1;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        matrix[j][i] = count;
                        count++;
                    }
                }
                printMatrix(matrix);

                break;
            case "B":

                int count2 = 1;
                for (int i = 0; i < matrix.length; i++) {
                    if (i % 2 == 0) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            matrix[j][i] = count2;
                            count2++;
                        }
                    } else {
                        for (int j = 0; j < matrix[i].length; j++) {
                            matrix[matrix[i].length-j-1][i] = count2;
                            count2++;
                        }

                    }
                }
                printMatrix(matrix);


                break;
        }


    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}

package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MatrixShuffling05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tokens = sc.nextLine().split("\\s+");
        int row = Integer.parseInt(tokens[0]);
        int col = Integer.parseInt(tokens[1]);

        String[][] matrix = new String[row][col];
        fillMatrix(matrix, sc);


        String input = sc.nextLine();
        while (!"END".equals(input)) {
            String[] swap = input.split("\\s+");

            if (swap[0].equals("swap") && swap.length == 5) {
                int rowIndex = Integer.parseInt(swap[1]);
                int colIndex = Integer.parseInt(swap[2]);
                int rowIndexSwap = Integer.parseInt(swap[3]);
                int colIndexSwap = Integer.parseInt(swap[4]);

                if (rowIndex < row && rowIndex >= 0
                        && colIndex >= 0 && colIndex < col
                        && rowIndexSwap >= 0 && rowIndexSwap < row
                        && colIndexSwap >= 0 && colIndexSwap < col
                ) {
                    String temp = matrix[rowIndexSwap][colIndexSwap];
                    matrix[rowIndexSwap][colIndexSwap] = matrix[rowIndex][colIndex];
                    matrix[rowIndex][colIndex] = temp;
                    printMatrix(matrix);
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }



            input = sc.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(String[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = sc.nextLine().split("\\s+");
        }
    }
}

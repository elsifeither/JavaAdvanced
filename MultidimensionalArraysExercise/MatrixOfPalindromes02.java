package MultidimensionalArraysExercises;

import java.util.Scanner;


public class MatrixOfPalindromes02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tokens = sc.nextLine().split("\\s+");
        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);

        String[][] matrix = new String[rows][cols];

        fillMatrix(matrix);
        printMatrix(matrix);


    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

        private static void fillMatrix (String[][]matrix){
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    String outsideSymbol = String.valueOf((char) ('a' + i));
                    String middleSymbol = String.valueOf((char) ('a' + i + j));
                    matrix[i][j] = outsideSymbol + middleSymbol + outsideSymbol;
                }
            }
        }
}

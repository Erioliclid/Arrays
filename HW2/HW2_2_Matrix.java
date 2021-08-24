package HW2;

import java.util.Scanner;

public class HW2_2_Matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = {
                {-1, 2, -3, 4, -5},
                {8, -9, 10, -11, 12},
                {-15, 16, -17, 18, -19},
                {22, -23, 24, -25, 26},
                {-29, 30, -31, 32, -33}
        };
        System.out.println("Choose operation:");
        System.out.println("Enter '1' to find negative numbers");
        System.out.println("Enter '2' to find negative numbers in chosen line");
        System.out.println("Enter '3' to find negative numbers in chosen core");
        System.out.println("Enter '4' to show diagonal numbers from left up angle");
        System.out.println("Enter '5' to show diagonal numbers from left down angle");
        int chose = scanner.nextInt();
        switch (chose) {
            case 1:
                findNegative(matrix);
                break;
            case 2:
                findNegInLine(matrix);
                break;
            case 3:
                findNegInCore(matrix);
                break;
            case 4:
                leftUpDiagonal(matrix);
                break;
            case 5:
                leftDownDiagonal(matrix);
                break;
            default:
                System.out.println("Wrong number");

        }


    }

    private static void findNegative(int[][] matrix) {
        for (int[] cores : matrix) {
            for (int line : cores) {
                if (line < 0) {
                    System.out.println(line);
                }

            }
        }
    }

    private static void findNegInLine(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line");
        int line = scanner.nextInt();
        int num;
        for (int i = line - 1; i == line - 1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                num = matrix[i][j];
                if (num < 0) {
                    System.out.println(num);
                }
            }
        }

    }

    private static void findNegInCore(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter core");
        int core = scanner.nextInt();
        int num;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = core - 1; j == core - 1; j++) {
                num = matrix[i][j];
                if (num < 0) {
                    System.out.println(num);
                }
            }
        }

    }

    private static void leftUpDiagonal(int[][] matrix) {
        int num;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    num = matrix[i][j];
                    System.out.println(num);
                }
            }
        }

    }

    private static void leftDownDiagonal(int[][] matrix) {
        int num;
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0, x = matrix[i].length; j < matrix[i].length; j++, x--) {
                if (i == x - 1) {
                    num = matrix[i][j];
                    System.out.println(num);
                }
            }
        }

    }




    /*private static void findNegativeCountInRow(int[][] matrix, int rowNumber) {
        int negativeCount = 0;
        for (int element : matrix[rowNumber]){
            if (element < 0) {
                negativeCount ++;
            }
        }

        System.out.println("Matrix: ");
        printMatrix(matrix);
        System.out.println(String.format("Has %d negative elements in #%d row ", negativeCount, rowNumber));

    }

    public static void printMatrix(int[][] matrix) {
        for (int[] array : matrix) {
            for (int anInt : array) {
                System.out.print(String.format("%5d", anInt));
            }
            System.out.println();
        }
    }*/
}
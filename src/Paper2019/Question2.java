package Paper2019;

import java.util.Random;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N : ");
        int N = scan.nextInt();
        System.out.println("Matrix A");
        int[][] matrixA = Matrix(N);
        displayMatrix(matrixA);
        System.out.println("Matrix B");
        int[][] matrixB = Matrix(N);
        displayMatrix(matrixB);
        AddMatrix(matrixA,matrixB);
        MultiMatrix(matrixA,matrixB);

    }
    public static int[][] Matrix(int n){
        Random r = new Random();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length ; i++) {// loop through rows
            for (int j = 0; j < matrix[i].length; j++) { // loop through columns
                matrix[i][j] = r.nextInt(10);
            }
        }
        return matrix;
    }
    public static void displayMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length ; i++) {// loop through rows
            for (int j = 0; j < matrix[i].length; j++) { // loop through columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void AddMatrix(int[][] Matrix , int[][] Matrix1){
        System.out.println("Matrix A + B");
        int[][] addMatrix = new int [Matrix.length][Matrix.length];
        for (int i = 0; i < Matrix.length ; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                addMatrix[i][j] = Matrix[i][j] + Matrix1[i][j];
            }
        }
        for (int i = 0; i < Matrix.length ; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.printf(addMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void MultiMatrix(int[][] Matrix , int[][] Matrix1){
        System.out.println("Matrix A x B");
        int[][] addMatrix = new int [Matrix.length][Matrix.length];
        for (int i = 0; i < Matrix.length ; i++) { // loop through rows
            for (int j = 0; j < Matrix[i].length; j++) { // loop through columns
                for (int k = 0; k < Matrix.length; k++) { // loop through columns
                    addMatrix[i][j] += Matrix[i][k] * Matrix1[k][j];

                }
            }
        }
        for (int i = 0; i < Matrix.length ; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.printf(addMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }


}

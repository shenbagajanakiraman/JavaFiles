/* Program to find the addition of two matrices */

package com.stackroute.pe3;

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        int column;
        int numberOfMatrix;

        System.out.println("Enter number of matrix...");
        numberOfMatrix = input.nextInt();

        System.out.println("Enter row index...");
        row = input.nextInt();

        System.out.println("Enter column index...");
        column = input.nextInt();

        int[][][] matrix = new int[numberOfMatrix][row][column];
        int[][]  sum = new int [row] [column];


        for (int k = 0; k < numberOfMatrix; k++) {

            System.out.println("Enter the Matrix" + (k + 1) + "elements...");

            for (int i = 0; i < row; i++) {

                for (int j = 0; j < column; j++) {
                    matrix[k][i][j] = input.nextInt();
                }

            }

        }


        for (int k = 0; k < numberOfMatrix; k++) {


            for (int i = 0; i < row; i++) {

                for (int j = 0; j < column; j++) {
                   sum [i][j] = matrix[k][i][j] + sum [i][j];
                }

            }

        }

        System.out.print("The Sum of Matrices...");

        for (int i = 0; i < row; i++) {
            System.out.println("");

            for (int j = 0; j < column; j++) {
                System.out.print("\t"+sum [i][j]);
            }

        }




    }
}

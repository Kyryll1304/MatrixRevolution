package com.me.kirilltrosnickii;

import java.util.Scanner;

public class WakeUpNeo {
    private static int readInt(Scanner scanner) {
        int x;
        while (true) {
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                if (x < 0) {
                    System.out.println("Only positive");
                    scanner.nextLine();
                } else {
                    return x;
                }
            } else {
                System.out.println("Only positive number");
                scanner.nextLine();
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You enter M parameter - the story ends, you wake up in your bed and believe whatever you want to believe. \nYou enter N parameter - you stay in Wonderland and I show you how deep the rabbit hole goes.\n(Okay,jokes out,enter M) ");
        int m=readInt(scan);
        System.out.println("Thanks,now N parameter");
        int n=readInt(scan);
        int[][] primaryMatrix = new int[m][n];
        int[][] transposedMatrix = new int[n][m];

        primaryMatrixWithFiller(primaryMatrix);
        transposedMatrix(primaryMatrix, transposedMatrix);
    }

    public static int[][] primaryMatrixWithFiller(int[][] sourceMatrix) {
        int numberFiller = 1;
        for (int i = 0; i < sourceMatrix.length; i++) {
            for (int j = 0; j < sourceMatrix[i].length; j++) {
                sourceMatrix[i][j] = numberFiller++;
                System.out.print(sourceMatrix[i][j] + " ");
            }
            System.out.println();
        }
        return sourceMatrix;
    }

    public static int[][] transposedMatrix(int[][] sourceMatrix, int[][] transposedMatrix) {
        for (int i = 0; i < sourceMatrix.length; i++) {
            for (int j = 0; j < sourceMatrix[i].length; j++) {
                transposedMatrix[j][i] = sourceMatrix[i][j];
            }
        }
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
        return transposedMatrix;
    }

}
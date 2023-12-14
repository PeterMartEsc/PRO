package ies.puerto;

import java.util.Scanner;

/**
 * Print a triangle with 1s. Ask user for number of rows
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        printTriangle();
    }

    /**
     * Method to allow user to input a number of rows.
     * @return number of rows
     */
    public static int inputRows() {
        Scanner input = new Scanner(System.in);
        int rows;
        do {
            System.out.println("Insert number of rows for the triangle: ");
            rows = input.nextInt();
            if (rows < 0) {
                System.out.println("Number of rows must be positive");
            }
        } while (rows <= 0);
        return rows;
    }

    /**
     * Prints triangle using a for loop
     */
    public static void printTriangle() {
        int rows = inputRows();
        //If we want the triangle to have equal sides, we need to leave spaces before we print the 1s
        int blankSpace = rows - 1;
        //The amount of 1s that will be printed in each iteration
        int printAmount = 1;
        for (int i = 0; i < rows; i++) {
            //Inner for-loop to add spaces before the 1s
            for (int j = 0; j < blankSpace; j++) {
                System.out.print(" ");
            }
            //Inner for-loop to print the 1s
            for (int j = 0; j < printAmount; j++) {
                System.out.print(1);

            }
            //Every row, the amount of blank spaces decreases by 1 to give it an inclination, like a real triangle
            blankSpace--;
            //Every row, the amount of 1s printed increases by 2, to give it an inclination on the other side
            printAmount += 2;
            //Line jump to print next row
            System.out.print("\n");
        }
    }
}

package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        try {
            System.out.print("Enter the number of meters: ");
            double meters = scanner.nextDouble();

            System.out.println("\nYou can convert meters to:");
            System.out.println("Miles - 1\nInches - 2\nYards - 3");
            System.out.print("Enter digit: ");
            int value = scanner.nextInt();

            double result = 0;

            switch (value) {
                case 1:
                    result = meters * 0.000621371192;
                    System.out.println("\nResult: " + decimalFormat.format(result) + " miles");
                    break;
                case 2:
                    result = meters * 39.370;
                    System.out.println("\nResult: " + decimalFormat.format(result) + " inches");
                    break;
                case 3:
                    result = meters * 1.0936;
                    System.out.println("\nResult: " + decimalFormat.format(result) + " yards");
                    break;
                default:
                    System.out.println("Error, enter the true digit!");
                    return;
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error!");
        }
    }
}

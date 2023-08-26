package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of months (from 1 to 12): ");
            int month = scanner.nextInt();

            String result;

            switch (month) {
                case 1: case 2: case 12:
                    result = "Winter";
                    break;
                case 3: case 4: case 5:
                    result = "Spring";
                    break;
                case 6: case 7: case 8:
                    result = "Summer";
                    break;
                case 9: case 10: case 11:
                    result = "Autumn";
                    break;
                default:
                    System.out.println("Error, enter the number of months from 1 to 12!");
                    return;
            }

            System.out.println("Result: " + result);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error, is not a number of months!");
        }
    }
}

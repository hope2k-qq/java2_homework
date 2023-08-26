package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first digit: ");
            int digit1= scanner.nextInt();

            System.out.print("Enter the second digit: ");
            int digit2 = scanner.nextInt();

            System.out.print("Enter the third digit: ");
            int digit3 = scanner.nextInt();

            if (isValid(digit1) && isValid(digit2) && isValid(digit3)) {
                int number = digit1 * 100 + digit2 * 10 + digit3;
                System.out.println("Result: " + number);
            } else {
                System.out.println("Error, enter digit from 0 to 9!");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error, is not a digit!");
        }

    }

    private static boolean isValid(int digit) {
        return digit >= 0 && digit <= 9;
    }
}

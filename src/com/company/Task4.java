package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter six-digit number: ");
            int number = scanner.nextInt();

            if(isValid(number)) {
                int digit1 = number / 100000;
                int digit2 = (number / 10000) % 10;
                int digit3 = (number / 100) % 10;
                int digit4 = (number / 1000) % 10;
                int digit5 = (number / 10) % 10;
                int digit6 = number % 10;

                int changeNumber = digit6 * 100000 + digit5 * 10000 + digit4 * 1000 + digit3 * 100 +
                        digit2 * 10 + digit1;
                System.out.println("Result: " + changeNumber);
            } else {
                System.out.println("Error, enter six-digit number!");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error, is not a number!");
        }
    }

    private static boolean isValid(int num) {
        return num >= 100000 && num <= 999999;
    }
}

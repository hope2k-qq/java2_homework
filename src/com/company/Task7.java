package com.company;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer: ");
            int number1 = scanner.nextInt();
            System.out.print("Enter the second integer: ");
            int number2 = scanner.nextInt();

            int lessValue = Math.min(number1, number2);
            int moreValue = Math.max(number1, number2);

            System.out.println("Odd numbers ranging from " + lessValue + " to " + moreValue + ":");

            if (lessValue % 2 == 0) {
                lessValue++;
            }
            for (int i = lessValue; i <= moreValue; i += 2) {
                System.out.print(i + "  ");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error!");
        }

    }
}

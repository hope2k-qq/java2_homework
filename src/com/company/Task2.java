package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter value: ");
            double value = scanner.nextDouble();

            System.out.print("Enter percent: ");
            double percent = scanner.nextDouble();

            double result = (percent / 100) * value;

            System.out.println("Result: " + result);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error!");
        }
    }
}

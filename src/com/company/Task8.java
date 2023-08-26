package com.company;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter start of range: ");
            int startRange = scanner.nextInt();
            System.out.print("Enter end of range: ");
            int endRange = scanner.nextInt();

            for (int value = startRange; value <= endRange; value++) {
                for (int multiplier = 1; multiplier <= 10; multiplier++) {
                    System.out.println(value + " * " + multiplier + " = " + (value * multiplier));
                }
                System.out.println();
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error!");
        }
    }
}

package com.company;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("\nEnter length line: ");
            int length = scanner.nextInt();

            System.out.println("\nYou can draw line:");
            System.out.println("Horizontal - 1\nVertical - 2");
            System.out.print("Enter digit: ");
            int value = scanner.nextInt();

            scanner.nextLine();

            System.out.print("\nEnter the character you want to draw a line: ");
            String input = scanner.nextLine();

            char symbol;
            if (input.length() == 1) {
                symbol = input.charAt(0);
                switch (value){
                    case 1:
                        drawLine(length, "horizontal", symbol);
                        break;
                    case 2:
                        drawLine(length, "vertical", symbol);
                        break;
                    default:
                        System.out.println("Error, enter the true digit!");
                        return;
                }
            } else {
                System.out.println("Error, is not a symbol!");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error!");
        }
    }

    public static void drawLine(int length, String line, char symbol) {
        if (line.equalsIgnoreCase("horizontal")) {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        } else if (line.equalsIgnoreCase("vertical")) {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        }
    }
}

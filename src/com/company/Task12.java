package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayRandom = new int[10];

        Random rand = new Random();

        for(int number = 0; number < arrayRandom.length; number++){
            arrayRandom[number] = rand.nextInt(81) - 40;
        }
        System.out.println("Not sorted: " + Arrays.toString(arrayRandom));

        try{
            System.out.println("\nSort by ascending - 1\nSort by descending - 2");
            System.out.print("Enter digit: ");
            int value = scanner.nextInt();

            switch (value) {
                case 1:
                    sort("ascending", arrayRandom);
                    break;
                case 2:
                    sort("descending", arrayRandom);
                    break;
                default:
                    System.out.println("Error, enter the true digit!");
                    return;
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error!");
        }

    }

    public static void sort(String typeSort, int[] array){
        if (typeSort.equalsIgnoreCase("ascending")) {
            Arrays.sort(array);
            System.out.println("\nSorted by ascending: " + Arrays.toString(array));
        } else if (typeSort.equalsIgnoreCase("descending")) {
            Arrays.sort(array);
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
            System.out.println("\nSorted by descending: " + Arrays.toString(array));
        }
    }
}

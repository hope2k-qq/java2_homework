package com.company;

import java.util.Arrays;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int[] arrayRandom = new int[10];

        Random rand = new Random();

        for(int number = 0; number < arrayRandom.length; number++){
            arrayRandom[number] = rand.nextInt(81) - 40;
        }
        System.out.println(Arrays.toString(arrayRandom));

        int count = 0;
        for (int num : arrayRandom) {
            if (num % 2 == 0) {
                count++;
            }
        }
        int evenCount = count;
        int oddCount = arrayRandom.length - evenCount;

        int negativeCount = 0;
        int positiveCount = 0;
        for (int value : arrayRandom) {
            if (value < 0) {
                negativeCount++;
            } else if (value > 0) {
                positiveCount++;
            }
        }

        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];
        int[] negativeArray = new int[negativeCount];
        int[] positiveArray = new int[positiveCount];

        int evenIndex = 0;
        int oddIndex = 0;
        int negativeIndex = 0;
        int positiveIndex = 0;

        for (int num : arrayRandom) {
            if (num % 2 == 0) {
                evenArray[evenIndex++] = num;
            } else {
                oddArray[oddIndex++] = num;
            }

            if (num < 0) {
                negativeArray[negativeIndex++] = num;
            } else if (num > 0) {
                positiveArray[positiveIndex++] = num;
            }
        }

        System.out.println("Even numbers: ");
        System.out.println(Arrays.toString(evenArray));

        System.out.println("Odd numbers: ");
        System.out.println(Arrays.toString(oddArray));

        System.out.println("Negative numbers: ");
        System.out.println(Arrays.toString(negativeArray));

        System.out.println("Positive numbers: ");
        System.out.println(Arrays.toString(positiveArray));
    }
}

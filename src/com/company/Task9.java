package com.company;

import java.util.Arrays;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int[] arrayRandom = new int[10];

        Random rand = new Random();

        for(int number = 0; number < arrayRandom.length; number++){
            arrayRandom[number] = rand.nextInt(81) - 40;
        }
        System.out.println(Arrays.toString(arrayRandom));

        int min = arrayRandom[0];
        int max = arrayRandom[0];
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (int value : arrayRandom) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
            if (value < 0) {
                negativeCount++;
            } else if (value > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
        System.out.println("Count of negative elements: " + negativeCount);
        System.out.println("Count of positive elements: " + positiveCount);
        System.out.println("Count of zeros: " + zeroCount);
    }
}

package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[9];
        System.out.println("Original array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 100);
            System.out.print(arr[i] + " ");
        }

        int temp;

        for (int i = 0; i <= arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println("Reversed array");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

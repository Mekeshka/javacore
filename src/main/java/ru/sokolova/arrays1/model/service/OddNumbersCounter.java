package ru.sokolova.arrays1.model.service;

public class OddNumbersCounter {
    public int countOddNumber(int[] arr) {
        int oddCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 & arr[i]!=0) {
                oddCounter++;
            }
        }
        return oddCounter;
    }
}
package ru.sokolova.arrays1.model.service;

public class ArrayService {
    public int countOddNumber(int[] arr) {
        int oddCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 & arr[i] != 0) {
                oddCounter++;
            }
        }
        return oddCounter;
    }
    public int countEvenNumber(int arr[]) {
        int evenCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 & arr[i] != 0) {
                evenCounter++;
            }
        }
        return evenCounter;
    }
    public int countPrimeNumber(int arr[]) {
        int primeNumberCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j =0; j<arr.length;j++){
                if (arr[j]<2){
                    break;
                }
            }
            for (int k = 2; k <= Math.sqrt(arr[i]); k++) {
                if (arr[i] % k == 0) {
                    break;
                } else {
                    primeNumberCounter++;
                }
            }
        }
        return primeNumberCounter;
    }
    public int countNumberSum(int arr[]) {
        int numberSum = 0;
        for (int i = 0; i < arr.length; i++) {
            numberSum = numberSum + arr[i];
        }
        return numberSum;
    }
    public int countDifferenceNumber(int arr[]) {
        int oddIndexSum = 0;
        int evenIndexSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                oddIndexSum = arr[i] + oddIndexSum;
            }
            if (i % 2 != 0) {
                evenIndexSum = arr[i] + evenIndexSum;
            }
        }
        int difference = oddIndexSum - evenIndexSum;
        return difference;
    }
    public int countZeroNumbers(int arr[]) {
        int zeroCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCounter++;
            }
        }
        return zeroCounter;
    }
}



package com.hackerrank.quigley;

import java.util.HashSet;

/**
 * Hello world!
 *
 */
public class Warmup {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static int sockMerchant(int n, int[] array) {
        int[] resultArray = new int[n];
        int total = 0;
        final int maxCapacity = 100;
        int index = 0;
        for (int i = 0; i < n; i++) {
            index = array[i] % n;
            if (resultArray[index] == 0) {
                resultArray[index] = 1;
            } else {
                resultArray[index] = 0;
                total += 1;
            }

        }
        return total;
    }

    public static int sockMerchant2(int n, int[] array) {
        HashSet resultArray = new HashSet(n);
        int total = 0;
        for (int i = 0; i < n; i++) {
            if (!resultArray.add(array[i])) {
                resultArray.remove(array[i]);
                total += 1;
            }
        }
        return total;
    }

    public static int countingValleys(int n, String path) {
        int valleys = 0;
        int runningTotal = 0;
        char step = 'a';
        for (int i = 0; i < n; i++) {
            step = path.charAt(i);
            if (step == 'U') {
                runningTotal -= 1;
                if (runningTotal == 0)
                    valleys += 1;
            } else //'D'
                runningTotal += 1;
        }
        return valleys;
    }

    public static int cloudJumping(int[] c) {
        int jumps = -1;
        for (int i = 0; i < c.length; i++,jumps++) {
            if (i<c.length-2 && c[i+2]==0 )
                i++;
        }
        return jumps;
    }

    public static long repeatedString(String s, long n){
        long numAsinS =0;
        long result=0;
        long divResult =  n/s.length();
        long remResult =   n % s.length();
        for (char c : s.toCharArray()){
            if (c=='a')numAsinS+=1;
        }
        result = divResult*numAsinS;
        for (int i = 0; i < remResult; i++) {
            if (s.charAt(i)=='a') result+=1;
        }

        return result;


    }
}

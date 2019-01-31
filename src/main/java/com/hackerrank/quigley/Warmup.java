package com.hackerrank.quigley;

import java.util.HashSet;

/**
 * Hello world!
 *
 */
public class Warmup
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int sockMerchant(int n, int[] array){
        int[] resultArray = new int[n];
        int total=0;
        final int maxCapacity=100;
        int index =0;
        for (int i = 0; i < n; i++) {
            index = array[i] % n;
            if(resultArray[index] == 0){
                resultArray[index] = 1;
            }
            else{
                resultArray[index] = 0;
                total+=1;
            }

        }
        return total;
    }


}

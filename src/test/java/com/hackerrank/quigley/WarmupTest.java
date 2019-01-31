package com.hackerrank.quigley;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class WarmupTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testSockMerchant()
    {
        String[] array = "10 20 20 10 10 30 50 10 20".split(" ");
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }

        assertEquals( 3,Warmup.sockMerchant2(intArray.length,intArray ));
    }
    @Test
    public void testSockMerchant2()
    {
        String[] array = "100".split(" ");
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }

        assertEquals( 0,Warmup.sockMerchant2(intArray.length,intArray ));
    }

    @Test
    public void testCountingValleys(){
        assertEquals(1,Warmup.countingValleys(8,"UDDDUDUU"));
    }
}

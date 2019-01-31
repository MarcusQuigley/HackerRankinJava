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

    @Test
    public void testCloudJumping(){
        int[] array = new int[]{0,0,1,0,0,1,0};
        assertEquals(4,Warmup.cloudJumping(array));
    }
    @Test
    public void testCloudJumping2(){
        int[] array = new int[]{0,0,0,0,1,0};
        assertEquals(3,Warmup.cloudJumping(array));
    }

    @Test
    public void testRepeatedString(){
         assertEquals(7,Warmup.repeatedString("aba",10));
         }
    @Test
    public void testRepeatedString2(){
         assertEquals(1000000000000l,Warmup.repeatedString("a",1000000000000L));
    }

    @Test
    public void testRepeatedString3(){
        assertEquals(330009788107L,Warmup.repeatedString("aadcdaccacabdaabadadaabacdcbcacabbbadbdadacbdadaccbbadbdcadbdcacacbcacddbcbbbaaccbaddcabaacbcaabbaaa",942885108885L));
    }

    @Test
    public void testRepeatedString4(){
        assertEquals(16481469408L,Warmup.repeatedString("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq",549382313570L));
    }

}

package com;

import java.util.Arrays;
import java.util.Random;

public class Nixsolutions {

    private static long sort(int[] mas) {
        int[] masToSort = new int[mas.length];
        System.arraycopy(mas, 0, masToSort, 0, mas.length);
        long startTime = System.nanoTime();
        for (int i = masToSort.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (masToSort[j] > masToSort[j + 1]) {
                    int tmp = masToSort[j];
                    masToSort[j] = masToSort[j + 1];
                    masToSort[j + 1] = tmp;
                }
            }
        }
        long finTime = System.nanoTime();
        return (finTime - startTime);
    }

    public static void testSortArray() {
        long[][] timeResalt = new long[2][20];
        int[] testMass = new int[1000];
        for (int i = 0; i < 20; i++) {
            System.arraycopy(createTestMass(System.nanoTime()), 0, testMass, 0, testMass.length);
            timeResalt[0][i] = sort(testMass);
            long startTime = System.nanoTime();
            Arrays.sort(testMass);
            long finTime = System.nanoTime();
            timeResalt[1][i] = finTime - startTime;
        }
        long[][] res = new long[2][1];
        System.arraycopy(averageValue(timeResalt), 0, res, 0, res.length);
        System.out.println("T1 My sort = " + res[0][0] + "T2 Arrye sort =" + res[1][0]);
    }


    private static int[] createTestMass(long time) {
        Random forGenRandommNumbers = new Random(time);
        int[] massRandom = new int[1000];
        for (int j = 0; j < 1000; j++) {
            massRandom[j] = forGenRandommNumbers.nextInt(100);
            if (forGenRandommNumbers.nextBoolean()) {
                massRandom[j] = massRandom[j] * -1;
            }
        }
        return massRandom;
    }

    private static long[][] averageValue(long[][] masResTime) {
        long[][] resaltAvVal = new long[masResTime.length][1];
        for (int i = 0; i < masResTime.length; i++) {
            long summElement = 0;
            for (int j = 0; j < masResTime[i].length; j++) {
                summElement = summElement + masResTime[i][j];
            }
            resaltAvVal[i][0] = summElement / masResTime[i].length;
        }
        return resaltAvVal;
    }

}

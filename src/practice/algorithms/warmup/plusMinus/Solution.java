package practice.algorithms.warmup.plusMinus;

import java.util.*;

class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        int denominator = arr.length;
        int posNumerator = 0;
        int negNumerator = 0;
        int zeroNumerator = 0;

        for (int i : arr) {
            if (i > 0) {
                posNumerator++;
            } else if (i < 0) {
                negNumerator++;
            } else {
                zeroNumerator++;
            }
        }

        System.out.println(createDecimalString(posNumerator, denominator));
        System.out.println(createDecimalString(negNumerator, denominator));
        System.out.println(createDecimalString(zeroNumerator, denominator));
    }

    private static String createDecimalString(final int numerator, final int denominator){
        final double dividend = (double) numerator / denominator;
        return String.format("%.6f", dividend);
    }


}


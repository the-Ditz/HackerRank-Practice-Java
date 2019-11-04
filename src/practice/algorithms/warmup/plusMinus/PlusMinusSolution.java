package practice.algorithms.warmup.plusMinus;

/**
 * This class contains the solution code for this exercise. See README.md for information about the purpose of this
 * repository or about HackerRank.com.
 *
 * All (or most) of the code in this file is original and was authored as an attempts to solve the provided problem. To
 * see the logic provided by HackerRank.com see the associated PlusMinusRunner class in this package.
 *
 * @see PlusMinusRunner
 * @see <a href="https://www.hackerrank.com/challenges/plus-minus/problem">Original problem from www.hackerrank.com</a>
 */
class PlusMinusSolution {

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


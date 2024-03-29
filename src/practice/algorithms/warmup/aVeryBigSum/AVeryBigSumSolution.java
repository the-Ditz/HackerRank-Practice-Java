package practice.algorithms.warmup.aVeryBigSum;

/**
 * This class contains the solution code for this exercise. See README.md for information about the purpose of this
 * repository or about HackerRank.com.
 *
 * All (or most) of the code in this file is original and was authored as an attempts to solve the provided problem. To
 * see the logic provided by HackerRank.com see the associated AVeryBigSumRunner class in this package.
 *
 * @see AVeryBigSumRunner
 * @see <a href="https://www.hackerrank.com/challenges/a-very-big-sum/problem">Original problem from www.hackerrank.com</a>
 */
class AVeryBigSumSolution {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for (long l : ar) {
            sum += l;
        }
        return sum;
    }
}

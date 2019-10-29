package practice.algorithms.warmup.aVeryBigSum;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * This class contains the main method and the logic provided by HackerRank.com for this exercise. See README.md for
 * information about the purpose of this repository or about HackerRank.com.
 *
 * All (or most) of the code in this file was provided by HackerRank.com. For code authored in attempts to solve the
 * provided problem see the associated SimpleArraySumSolution class in this package.
 *
 * @see AVeryBigSumSolution
 * @see <a href="https://www.hackerrank.com/challenges/a-very-big-sum/problem">Original problem from www.hackerrank.com</a>
 */
public class AVeryBigSumRunner {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        AVeryBigSumSolution solution = new AVeryBigSumSolution();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] ar = new long[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arItems[i]);
            ar[i] = arItem;
        }

        long result = solution.aVeryBigSum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

package practice.algorithms.warmup.simpleArraySum;

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
 * @see SimpleArraySumSolution
 * @see <a href="https://www.hackerrank.com/challenges/simple-array-sum/problem">Original problem from www.hackerrank.com</a>
 */
public class SimpleArraySumRunner {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        SimpleArraySumSolution simpleArraySumSolution = new SimpleArraySumSolution();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = simpleArraySumSolution.simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}

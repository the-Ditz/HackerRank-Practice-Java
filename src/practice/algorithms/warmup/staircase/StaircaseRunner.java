package practice.algorithms.warmup.staircase;

import utils.Constants;
import utils.ScannerUtil;

import java.util.Scanner;

/**
 * This class contains the main method and the logic provided by HackerRank.com for this exercise. See README.md for
 * information about the purpose of this repository or about HackerRank.com.
 *
 * All (or most) of the code in this file was provided by HackerRank.com. For code authored in attempts to solve the
 * provided problem see the associated StaircaseSolution class in this package.
 *
 * @see StaircaseSolution
 * @see <a href="https://www.hackerrank.com/challenges/staircase/problem">Original problem from www.hackerrank.com</a>
 */
public class StaircaseRunner {

    private static final String TEST_INPUT = "src\\practice\\algorithms\\warmup\\staircase\\input\\input01.txt";

    private static final Scanner scanner = ScannerUtil.getScannerForFile(TEST_INPUT);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip(Constants.SCANNER_SKIP_PATTERN);

        StaircaseSolution.staircase(n);

        scanner.close();
    }
}

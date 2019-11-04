package practice.algorithms.warmup.plusMinus;

import utils.Constants;

import java.util.Scanner;

/**
 * This class contains the main method and the logic provided by HackerRank.com for this exercise. See README.md for
 * information about the purpose of this repository or about HackerRank.com.
 *
 * All (or most) of the code in this file was provided by HackerRank.com. For code authored in attempts to solve the
 * provided problem see the associated PlusMinusSolution class in this package.
 *
 * @see PlusMinusSolution
 * @see <a href="https://www.hackerrank.com/challenges/plus-minus/problem">Original problem from www.hackerrank.com</a>
 */
public class PlusMinusRunner {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip(Constants.SCANNER_SKIP_PATTERN);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip(Constants.SCANNER_SKIP_PATTERN);

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        PlusMinusSolution.plusMinus(arr);

        scanner.close();
    }
}

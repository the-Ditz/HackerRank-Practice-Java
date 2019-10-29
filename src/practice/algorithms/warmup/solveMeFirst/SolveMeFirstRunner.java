package practice.algorithms.warmup.solveMeFirst;

import java.util.Scanner;

/**
 * This class contains the main method and the logic provided by HackerRank.com for this exercise. See README.md for
 * information about the purpose of this repository or about HackerRank.com.
 *
 * All (or most) of the code in this file was provided by HackerRank.com. For code authored in attempts to solve the
 * provided problem see the associated SolveMeFirstSolution class in this package.
 *
 * @see SolveMeFirstSolution
 * @see <a href="https://www.hackerrank.com/challenges/solve-me-first/problem">Original problem from www.hackerrank.com</a>
 */
public class SolveMeFirstRunner {

    public static void main(String[] args) {

        final SolveMeFirstSolution solution = new SolveMeFirstSolution();

        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solution.solveMeFirst(a, b);
        System.out.println(sum);
    }
}
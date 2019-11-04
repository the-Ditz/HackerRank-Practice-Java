package practice.algorithms.warmup.staircase;

/**
 * This class contains the solution code for this exercise. See README.md for information about the purpose of this
 * repository or about HackerRank.com.
 *
 * All (or most) of the code in this file is original and was authored as an attempts to solve the provided problem. To
 * see the logic provided by HackerRank.com see the associated StaircaseRunner class in this package.
 *
 * @see StaircaseRunner
 * @see <a href="https://www.hackerrank.com/challenges/staircase/problem">Original problem from www.hackerrank.com</a>
 */
class StaircaseSolution {

    static void staircase(int n) {

        for (int row = 1; row <= n; row++) {
            for (int space = n - row; space > 0; space--) {
                System.out.print(" ");
            }
            for (int hash = row; hash > 0; hash--) {
                System.out.print("#");
            }

            if (row < n){
                System.out.print("\n");
            }
        }

    }
}

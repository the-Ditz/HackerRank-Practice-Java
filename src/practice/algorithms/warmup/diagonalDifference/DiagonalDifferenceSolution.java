package practice.algorithms.warmup.diagonalDifference;

import java.util.*;

/**
 * This class contains the solution code for this exercise. See README.md for information about the purpose of this
 * repository or about HackerRank.com.
 *
 * All (or most) of the code in this file is original and was authored as an attempts to solve the provided problem. To
 * see the logic provided by HackerRank.com see the associated DiagonalDifferenceRunner class in this package.
 *
 * @see DiagonalDifferenceRunner
 * @see <a href="https://www.hackerrank.com/challenges/compare-the-triplets/problem">Original problem from www.hackerrank.com</a>
 */
class DiagonalDifferenceSolution {

    static int diagonalDifference(List<List<Integer>> arr) {

        int gridDimension = arr.size();

        int leftToRightIndex = 0;
        int leftToRightSum = 0;

        int rightToLeftIndex = gridDimension - 1;
        int rightToLeftSum = 0;

        for (final List<Integer> lineList : arr) {

            leftToRightSum += lineList.get(leftToRightIndex);
            leftToRightIndex++;

            rightToLeftSum += lineList.get(rightToLeftIndex);
            rightToLeftIndex--;
        }

        return Math.abs(rightToLeftSum - leftToRightSum);
    }
}




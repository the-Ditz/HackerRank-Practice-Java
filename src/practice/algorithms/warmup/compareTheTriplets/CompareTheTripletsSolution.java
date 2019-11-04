package practice.algorithms.warmup.compareTheTriplets;

import practice.algorithms.warmup.simpleArraySum.SimpleArraySumRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * This class contains the solution code for this exercise. See README.md for information about the purpose of this
 * repository or about HackerRank.com.
 *
 * All (or most) of the code in this file is original and was authored as an attempts to solve the provided problem. To
 * see the logic provided by HackerRank.com see the associated CompareTheTripletsRunner class in this package.
 *
 * @see CompareTheTripletsRunner
 * @see <a href="https://www.hackerrank.com/challenges/compare-the-triplets/problem">Original problem from www.hackerrank.com</a>
 */
class CompareTheTripletsSolution {

    private static final int SCORE_LIST_SIZE = 3;

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        if (a.size() != SCORE_LIST_SIZE || b.size() != SCORE_LIST_SIZE) {
            throw new IllegalArgumentException(String.format("All input lists must be of size = %s", SCORE_LIST_SIZE));
        }

        final List<Integer> outputScores = new ArrayList<>();
        outputScores.add(0);
        outputScores.add(0);

        for (int index = 0; index < SCORE_LIST_SIZE; index++) {

            final int aScore = a.get(index);
            final int bScore = b.get(index);

            if (aScore > bScore) {
                outputScores.set(0, outputScores.get(0) + 1);
            } else if (bScore > aScore) {
                outputScores.set(1, outputScores.get(1) + 1);
            }
        }
        return outputScores;
    }
}

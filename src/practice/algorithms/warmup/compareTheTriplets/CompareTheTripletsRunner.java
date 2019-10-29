package practice.algorithms.warmup.compareTheTriplets;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * This class contains the main method and the logic provided by HackerRank.com for this exercise. See README.md for
 * information about the purpose of this repository or about HackerRank.com.
 *
 * All (or most) of the code in this file was provided by HackerRank.com. For code authored in attempts to solve the
 * provided problem see the associated SimpleArraySumSolution class in this package.
 *
 * @see CompareTheTripletsSolution
 * @see <a href="https://www.hackerrank.com/challenges/compare-the-triplets/problem">Original problem from www.hackerrank.com</a>
 */
public class CompareTheTripletsRunner {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = CompareTheTripletsSolution.compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

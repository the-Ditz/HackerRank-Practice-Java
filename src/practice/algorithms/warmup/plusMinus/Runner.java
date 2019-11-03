package practice.algorithms.warmup.plusMinus;

import java.util.Scanner;

public class Runner {

    private static final String PATTERN = "(\r\n|[\n\r\u2028\u2029\u0085])?";

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip(PATTERN);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip(PATTERN);

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        Solution.plusMinus(arr);

        scanner.close();
    }
}

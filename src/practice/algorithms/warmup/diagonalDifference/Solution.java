package practice.algorithms.warmup.diagonalDifference;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Solution {

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




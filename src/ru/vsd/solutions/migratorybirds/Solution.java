//Problem: https://www.hackerrank.com/challenges/migratory-birds
//Java 8

package ru.vsd.solutions.migratorybirds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the migratoryBirds function below.
        static int migratoryBirds(List<Integer> arr) {
        int count = 0;
        int number = 0;
        for (int i = 1; i <= 5; i++) {
            int k = i;
            int currentCount = (int) arr.stream().filter(a -> a == k).count();
            if (currentCount > count) {
                count = currentCount;
                number = k;
            }
        }
        return number;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = migratoryBirds(arr);

        System.out.println(result);

        bufferedReader.close();
    }
}
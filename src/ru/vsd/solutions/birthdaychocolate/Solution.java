//Problem: https://www.hackerrank.com/challenges/the-birthday-bar
//Java 8

package ru.vsd.solutions.birthdaychocolate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int i = 0;
        while (s.size() - i >= m) {
            int sum = s.subList(i, i + m).stream().reduce(0, Integer::sum);
            if (sum == d) {
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);
        int m = Integer.parseInt(dm[1]);
        int result = birthday(s, d, m);
        System.out.println(result);
        bufferedReader.close();
    }
}
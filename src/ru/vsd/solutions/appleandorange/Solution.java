// Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Sam’s two children, Larry and Rob, decide to play a game in which they each climb a tree and throw fruit at their (Sam’s) house. Each fruit that lands on the house scores one point for the one who threw it. Larry climbs the tree on the left (the apple), and Rob climbs the one on the right (the orange).

// We’ll use the following diagram to describe the challenge:

// Apple and orange(2).png

// For simplicity, we’ll assume all of the landmarks are on a number line. Larry climbs the apple tree at point , and Rob climbs the orange tree at point . Sam’s house stands between points  and . Values increase from left to right.

// You will be given a list of distances the fruits are thrown. Negative distances indicate travel left and positive distances, travel right. Your task will be to calculate the scores for Larry and Rob and report them each on a separate line.

// Input Format

// The first line contains two space-separated integers denoting the respective values of and .
// The second line contains two space-separated integers denoting the respective values of  and .
// The third line contains two space-separated integers denoting the respective values of and .
// The fourth line contains  space-separated integers denoting the respective distances that each apple falls from point .
// The fifth line contains  space-separated integers denoting the respective distances that each orange falls from point .

// Constraints

// Output Format

// Print two lines of output:

// On the first line, print the number of apples that fall on Sam's house.
// On the second line, print the number of oranges that fall on Sam's house.
// Sample Input 0

// 7 11
// 5 15
// 3 2
// -2 2 1
// 5 -6
// Sample Output 0

// 1 1
// Explanation 0

// The first apple falls at position
// The second apple falls at position
// The third apple falls at position
// The first orange falls at position
// The second orange falls at position

// Only one fruit (the second apple) falls within the region between  and , so we print  as our first line of output.
// Only the second orange falls within the region between  and , so we print  as our second line of output.

package ru.vsd.solutions.appleandorange;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        System.out.println(Arrays.stream(apples).map(i -> i + a).filter(i -> (i >= s && i <= t)).count());
        System.out.println(Arrays.stream(oranges).map(i -> i + b).filter(i -> (i >= s && i <= t)).count());
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");
        int s = Integer.parseInt(st[0]);
        int t = Integer.parseInt(st[1]);
        String[] ab = scanner.nextLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);
        String[] mn = scanner.nextLine().split(" ");
        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);
        int[] apples = new int[m];
        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }
        int[] oranges = new int[n];
        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }
        countApplesAndOranges(s, t, a, b, apples, oranges);
        scanner.close();
    }
}
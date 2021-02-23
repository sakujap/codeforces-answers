package main.java.problemset;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfCubes_1490C {
    /**
     * https://codeforces.com/problemset/problem/1490/C Problem id is "1490C" and
     * rating is "1100"
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var num = sc.nextInt();
        while (num-- > 0) {
            var n = sc.nextLong();
            var b = checkSumOfCubes(n);
            System.out.println(b ? "YES" : "NO");
        }
    }

    private static boolean checkSumOfCubes(long x) {
        for (int i = 1; i < Math.cbrt(x); i++) {
            var b = Math.cbrt(x - i * i * i);
            if (b * b * b == x - i * i * i) {
                return true;
            }
        }
        return false;
    }

}

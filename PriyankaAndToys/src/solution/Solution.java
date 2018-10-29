package solution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Solution {

    /**
     * https://www.hackerrank.com/challenges/priyanka-and-toys/problem
     **/

    private static boolean find(int [] array, int p) {
        for (int anArray : array) {
            if (Math.abs(anArray - p) < 5)
                return true;
        }
        return false;
    }


    // Complete the toys function below.
    private static int toys(int[] w) {
        //Arrays.sort(w);
        int acc = 1, s = 0;
        for (int i = 1; i <w.length; i++) {
            int [] target = new int [i-s];
            System.arraycopy(w, s, target,  0, i-s);
            if (!find(target, w[i])) {
                acc++;
                s = i;
            }
        }
        return acc;
    }


    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        System.out.println(toys(new int[]{1, 2, 3, 4, 5, 10, 11, 12, 13}));
        System.out.println(toys(new int[]{1, 2, 3, 21, 7, 12, 14, 21}));
    }

}

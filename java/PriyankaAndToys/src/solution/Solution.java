package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Solution {

    /**
     * https://www.hackerrank.com/challenges/priyanka-and-toys/problem
     * DONE
     **/

    private static boolean find(TreeSet<Integer> set, int p) {
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (Math.abs(i - p) < 5) {
                if(i > p) {
                    it.remove();
                    set.add(p);
                }
                return true;
            }
        }
        return false;
    }

    // Complete the toys function below.
    private static int toys(int[] w) {
        Arrays.sort(w);
        int acc = 1, min = w[0];
        //TreeSet<Integer> set = new TreeSet<>();
        for (int i = 1; i <w.length; i++) {
            /*
            if (!find(set, w[i])) {
                acc++;
                set.add(w[i]);
            }
            */

            if(Math.abs(w[i] - min) > 4) {
                acc++;
                min = w[i];
            }
        }
        return acc;
    }

    private static void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(reader.readLine());
            int [] w = new int[n];
            StringTokenizer tk = new StringTokenizer(reader.readLine(), " ");
            int acc = 0;
            while (tk.hasMoreTokens()) {
                w[acc++] = Integer.parseInt(tk.nextToken());
            }
            System.out.println(toys(w));
        } catch (IOException ignore) {}
    }

    public static void main(String[] args) {
        run();
        System.out.println(toys(new int[] {0, 2, 9, 10, 13, 16, 17, 17, 18, 19}));
        System.out.println(toys(new int[]{88, 34, 99, 23, 30, 84, 56, 37, 5, 55}));
        System.out.println(toys(new int[]{1, 2, 3, 21, 7, 12, 14, 21}));
        System.out.println(toys(new int[]{1, 2, 3, 4, 5, 10, 11, 12, 13}));
        System.out.println(toys(new int[]{1, 2, 3, 10, 17}));
    }

}

package class3.boj11727;

import java.util.Arrays;
import java.util.Scanner;

public class Boj11727_tk {
    static int[] cache;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cache = new int[n + 3];
        Arrays.fill(cache, -1);
        cache[0] = 0;
        cache[1] = 1;
        cache[2] = 3;
        for(int i = 3; i <= n; i++)
            cache[i] = (2 * cache[i - 2] + cache[i - 1]) % 10007;
        System.out.println(cache[n]);
    }
}
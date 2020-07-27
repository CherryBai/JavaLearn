package java_learn;

import java.util.ArrayList;
import java.util.List;

public class LC_60_getPermutation {
    public static String getPermutation(int n, int k) {
        int[] dp = new int[n];
        StringBuffer sb = new StringBuffer();
        dp[0] = 1;

        List<Integer> set = new ArrayList<>();
        set.add(1);
        for (int i = 1; i < n; ++i) {
            //dp:0! 1! 2! 3! 4! ... (n-1)!
            dp[i] = dp[i - 1] * i;
            System.out.println("dp size: " + dp.length);
            //set: 1 2 3 4...n
            set.add(i + 1);
        }
        //--k;

        for (int i = n - 1; i > -1; --i) {
            int idx = k / dp[i];
            k -= idx * dp[i];

            sb.append(set.get(idx));
            set.remove(idx);
        }


        return sb.toString();
    }


    public static void main(String[] args) {
        int n = 4, k = 9;
        System.out.println(getPermutation(n,k));
    }
}

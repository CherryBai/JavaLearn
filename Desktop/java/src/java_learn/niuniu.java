package java_learn;

public class niuniu {
    public int solve (int n, int[] a) {

        // write code here
        int res = a[0];
        for (int i = 1; i < a.length; i++) {
            res ^= a[i];
        }
        if (res != 0){
            return 0;
        }

        int [] dp =new int [n + 1];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 2] * 2;
        }


    return dp[n];
    }



}

package java_learn;

/*
一条包含字母 A-Z 的消息通过以下方式进行了编码：

'A' -> 1
'B' -> 2
...
'Z' -> 26
给定一个只包含数字的非空字符串，请计算解码方法的总数。

示例 1:

输入: "12"
输出: 2
解释: 它可以解码为 "AB"（1 2）或者 "L"（12）。
示例 2:

输入: "226"
输出: 3
解释: 它可以解码为 "BZ" (2 26), "VF" (22 6), 或者 "BBF" (2 2 6) 。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/decode-ways
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LC_91_numDecodings {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0 ) {
            return 0;
        }
        int[] dp = new int[n];

        if ((s.charAt(0) - '0') == 0){
            dp[0] = 0;
        }else {
            dp[0] = 1;
        }

        for (int i = 1; i < n ; i++) {
            if ((s.charAt(i) - '0') > 6){
                dp[i] = dp[i - 1];
            }

            if ((s.charAt(i) - '0') <= 6 && (s.charAt(i) - '0') >= 1 ){
                if ((s.charAt(i - 1) - '0') >= 1 && (s.charAt(i - 1) - '0') <= 2){
                    dp[i] = dp[i - 1] + 1;
                }else {
                    dp[i] = dp[i - 1];
                }
            }
            if ((s.charAt(i) - '0') == 0){
                if (i == n - 1){

                }
                if ((s.charAt(i - 1) - '0') > 3){
                    dp[i] = dp[i - 1];
                }
                else {
                    dp[i ] = dp[i - 1] + 1;
                }
            }

        }


        return dp[n - 1];
    }


}

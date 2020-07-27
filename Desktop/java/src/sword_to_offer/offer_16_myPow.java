package sword_to_offer;


/*
实现函数double Power(double base, int exponent)，求base的exponent次方。不得使用库函数，同时不需要考虑大数问题。

 

示例 1:

输入: 2.00000, 10
输出: 1024.00000
示例 2:

输入: 2.10000, 3
输出: 9.26100
示例 3:

输入: 2.00000, -2
输出: 0.25000
解释: 2-2 = 1/22 = 1/4 = 0.25

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 */
public class offer_16_myPow {
    public double myPow(double x, int n) {
        if (x == 0){
            return 0;
        }
        if (n == 0){
            return 1.0;
        }
        int temp = n > 0 ? n : -n;
        double res = 1;

        for (int i = 0; i < temp / 2; i++) {
            res *= x;
        }
        res *= (temp % 2) == 0 ? res : res * x;

        return n > 0 ?  res : 1 / res;
    }

    public double myPow_bit(double x, int n) {
        if(x == 0) return 0;
        long b = n;
        double res = 1.0;
        if(b < 0) {
            x = 1 / x;
            b = -b;
        }
        while(b > 0) {
            if((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }

}

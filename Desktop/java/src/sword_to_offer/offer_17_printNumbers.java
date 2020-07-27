package sword_to_offer;

public class offer_17_printNumbers {
    /*
    输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。

示例 1:

输入: n = 1
输出: [1,2,3,4,5,6,7,8,9]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public int[] printNumbers(int n) {
        if(n == 0){
            return null;
        }
        int size = 9;
        for (int i = 2; i <= n; i++) {
            size = size * 10 + 9;
        }
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = i + 1;
        }
        return res;

    }
}

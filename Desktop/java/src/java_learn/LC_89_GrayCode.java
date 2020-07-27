package java_learn;


/*
格雷编码是一个二进制数字系统，在该系统中，两个连续的数值仅有一个位数的差异。

给定一个代表编码总位数的非负整数 n，打印其格雷编码序列。即使有多个不同答案，你也只需要返回其中一种。

格雷编码序列必须以 0 开头。


示例 1:

输入: 2
输出: [0,1,3,2]
解释:
00 - 0
01 - 1
11 - 3
10 - 2

对于给定的 n，其格雷编码序列并不唯一。
例如，[0,2,3,1] 也是一个有效的格雷编码序列。

00 - 0
10 - 2
11 - 3
01 - 1

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/gray-code
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LC_89_GrayCode {
    public static List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(0);
        for (int i = 0; i < n; i++) {
            List<Integer> temp = res;
            for (int j = temp.size() - 1; j >= 0; j--) {
                int t = temp.get(j) + (int)Math.pow(2, i);
                res.add(t);
            }

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("input an int number:");
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();
        List<Integer> res = grayCode(x);
        Iterator it = res.iterator();
        while (it.hasNext()){
            System.out.print(" " + it.next());
        }
    }

}

package java_learn;

import java.util.*;
/*
给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。

示例:

输入: n = 4, k = 2
输出:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/combinations
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class LC_77_combine {
    private static List<List<Integer>> res = new LinkedList<>();

    public static List<List<Integer>> combine(int n, int k) {

        backtrack(n,k, 1,new LinkedList<>());

        return res;
    }

    public static void backtrack(int n, int k,int begin, LinkedList<Integer> out){
        if (k == 0){
            res.add(new LinkedList<>(out));
            return;
        }
        for (int i = begin; i < n + 1; i++) {
            out.add(i);
            backtrack(n,k - 1,i + 1,out);
            out.removeLast();
        }

    }


    public static void main(String[] args) {
        List<List<Integer>> output = combine(1,1);
        for (List<Integer> x : output) {
            for (Integer y : x
                 ) {
                System.out.printf(String.valueOf(y));
            }
            System.out.println();
        }
    }
}

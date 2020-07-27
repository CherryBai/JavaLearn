package java_learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。

示例 1:

输入:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
输出: [1,2,3,6,9,8,7,4,5]
示例 2:

输入:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
输出: [1,2,3,4,8,12,11,10,9,5,6,7]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/spiral-matrix
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LC_54_spiralOrder {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int len = m * n;
        if(len == 0) return res;
        int[] dm = {0, 1, 0, -1};
        int[] dn = {1, 0, -1, 0};
        boolean[][] visited = new boolean[m][n];
        int r = 0;
        int c = 0;
        int di = 0;

        for (int i = 0; i < len; i++) {
            res.add(matrix[r][c]);
            visited[r][c] = true;
            int cr = r + dm[di];
            int cc = c + dn[di];
            if (0 <= cr && cr < m && 0 <= cc && cc < n && !visited[cr][cc]){
                r = cr;
                c = cc;
            } else {
                di = (di + 1) % 4;
                r += dm[di];
                c += dn[di];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> res = spiralOrder(a);
        Iterator it = res.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }

}

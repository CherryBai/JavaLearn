package java_learn;

import java.util.ArrayList;
import java.util.List;

/*
给定一个 m x n 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用原地算法。

示例 1:

输入:
[
  [1,1,1],
  [1,0,1],
  [1,1,1]
]
输出:
[
  [1,0,1],
  [0,0,0],
  [1,0,1]
]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/set-matrix-zeroes
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LC_73_setZeroes {
    public static void setZeroes(int[][] matrix) {
        int row_len = matrix.length;
        int col_len = matrix[0].length;
        List<Integer> row_set = new ArrayList<>();
        List<Integer> col_set = new ArrayList<>();
        for (int i = 0; i < row_len; i++) {
            for (int j = 0; j < col_len; j++) {
                if (matrix[i][j] == 0){
                    if (!row_set.contains(i)){
                        row_set.add(i);
                    }
                    if (!col_set.contains(j)){
                        col_set.add(j);
                    }
                }
            }
        }

        for (int i = 0; i < row_set.size(); i++) {
            int row_zero = row_set.get(i);
            for (int j = 0; j < col_len; j++) {
                matrix[row_len][j] = 0;
            }
        }

        for (int i = 0; i < col_set.size(); i++) {
            int col_zero = col_set.get(i);
            for (int j = 0; j < col_len; j++) {
                matrix[j][col_zero] = 0;
            }
        }



    }
}

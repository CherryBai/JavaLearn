package java_learn;
/*
编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：

每行中的整数从左到右按升序排列。
每行的第一个整数大于前一行的最后一个整数。
示例 1:

输入:
matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 3
输出: true
示例 2:

输入:
matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 13
输出: false

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/search-a-2d-matrix
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LC_74_searchMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean res = false;
        int m = matrix.length;
        if( m == 0) return res;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n - 1;
        int mid = (left + right) /2;
        while (left <= right){
            mid = (right + left) / 2;
            if (matrix[mid / n][mid % n] == target){
                return true;
            }
            if (matrix[mid/n][mid % n] < target){
                left = mid + 1;
            }
            if (matrix[mid/n][mid % n] > target){
                right = mid - 1;
            }

        }


        return res;
    }


    public static void main(String[] args) {
        int[][]  a = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 7;
        System.out.println(searchMatrix(a,target));
    }
}

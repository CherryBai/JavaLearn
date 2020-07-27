package java_learn;

/*
给定一个 n × n 的二维矩阵表示一个图像。

将图像顺时针旋转 90 度。

说明：

你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。

示例 1:

给定 matrix =
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

原地旋转输入矩阵，使其变为:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/rotate-image
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class LC_48_rotate {
    public static void rotate(int[][] matrix) {
        zhuanzhi(matrix);
        nixu(matrix);
    }


    public static void zhuanzhi(int[][] matrix){
        int n = matrix.length;
        for(int i = 0; i < n; i ++ ){
            for(int j = i; j < n; j ++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println("zhuanzhi:");
        for(int[] x : matrix){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }


    public static void nixu(int[][] matrix){
        int n = matrix.length;
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n/2; j ++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        System.out.println("result:");
        for(int[] x : matrix){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

}

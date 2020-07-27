package java_learn;

public class LC_59_generateMatrix {
    public static int[][] generateMatrix(int n) {
        int[] clo_j = {1, 0, -1, 0};
        int[] row_i = {0, 1, 0, -1};
        int[][] res = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        int idx = 1;
        int row = 0;
        int col = 0;
        int i = 0;

        while (idx <= n * n){
            res[row][col] = idx;
            visited[row][col] = true;
            int row_test =row + row_i[i];
            int col_test =col + clo_j[i];
            if(row_test >= 0 && row_test < n && col_test >= 0 && col_test <n &&!visited[row_test][col_test]){
                row = row_test;
                col = col_test;

            }else {
                i = (i + 1)% 4;
                row += row_i[i];
                col += clo_j[i];
            }

            idx ++;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] res = generateMatrix(n);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                System.out.printf(res[i][j] + " ");
            }
            System.out.println();
        }
    }

}

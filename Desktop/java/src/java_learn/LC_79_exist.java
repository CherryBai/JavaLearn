package java_learn;

/*
给定一个二维网格和一个单词，找出该单词是否存在于网格中。

单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。

 

示例:

board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

给定 word = "ABCCED", 返回 true
给定 word = "SEE", 返回 true
给定 word = "ABCB", 返回 false

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/word-search
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LC_79_exist {
    int[][] dires = {{0,1},{0,-1},{1,0},{-1,0}};
    boolean[][] visted;
    int row;
    int col;
    boolean found;



    public boolean exist(char[][] board, String word) {
        row = board.length;
        col = board[0].length;
        char[] words = word.toCharArray();
        visted = new boolean[row][col];
        found = false;
        if (row * col < word.length()){
            return false;
        }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == words[0]){
                    backtrack(board, words,1, i , j);
                    if (found == true){
                        return true;
                    }
                }
            }
        }


        return false;
    }

    public void backtrack(char[][] board, char[] words, int index, int x, int y){
        if (found == true){
            return;
        }
        if (index == words.length){
            found = true;
            return;
        }

        visted[x][y] = true;
        for (int[] dire : dires) {
            int new_x = dire[0] + x;
            int new_y = dire[1] + y;
            if (isInborad(new_x,new_y) && !visted[new_x][new_y]
                    && board[new_x][new_y] == words[index]){
                backtrack(board, words, index + 1, new_x, new_y);
            }

        }
        visted[x][y] = false;

    }

    public boolean isInborad(int x, int y){
        return x >= 0 && x <= row && y >= 0 && y < col;
    }

}

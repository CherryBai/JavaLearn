package java_learn;

public class nine_nine_shudu {
    public static boolean isValidSudoku(char[][] board) {
        boolean flag = false;
        flag = (row_scan(board) && col_scan(board) && matrix_scan(board));

        return flag;
    }

    public static boolean row_scan(char[][] board){
        boolean flag = true;
        boolean[] flags =new boolean[9];
        for (int  i = 0; i < board.length; i ++){
            for (int j = 0; j < board[i].length; j ++){
                if(board[i][j] != '.'){
                    if(flags[Integer.valueOf(board[i][j])] == false){
                        flags[Integer.valueOf(board[i][j])] = true;
                    }else {
                        return false;
                    }
                }
            }
        }
        return flag;
    }

    public static boolean col_scan(char[][] board){
        boolean flag = true;

        return flag;
    }

    public static boolean matrix_scan(char[][] board){
        boolean flag = true;

        return flag;
    }

}

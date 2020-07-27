package java_learn;

public class Niuke_1 {

    public static boolean Find(int target, int [][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int i = rows - 1;
        int j = 0;
        while( i >= 0 && j <= cols -1){
            if(array[i][j] == target) {
                return true;
            }
            if(array[i][j] > target) {
                i--;
            }
            if(array[i][j] < target){
                j++;
            }
        }
        return false;
    }

    public static void main(String[] arg){
        int[][] a = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int p = 7;
        System.out.print(Find(p,a));

    }
}

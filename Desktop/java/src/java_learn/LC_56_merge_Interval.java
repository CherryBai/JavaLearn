package java_learn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class LC_56_merge_Interval {
    public static int[][] merge(int[][] intervals) {
        int row = intervals.length;
        if (row == 0 ) return null;
        //按照intervals[][0]排序
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        Stack<Integer> stack = new Stack<>();

        stack.push(intervals[0][0]);
        stack.push(intervals[0][1]);


        for (int i = 1; i < row; i++) {
            for (int j = 0; j < 2; j++) {
                if(intervals[i][0] > stack.peek()){
                    stack.push(intervals[i][0]);
                    stack.push(intervals[i][1]);
                }

                if(intervals[i][0] <= stack.peek()){
                    int temp_high = stack.pop();
                    int temp_low = stack.pop();
                    temp_low = Math.min(temp_low, intervals[i][0]);
                    temp_high = Math.max(temp_high, intervals[i][1]);
                    stack.push(temp_low);
                    stack.push(temp_high);
                }

            }
        }

        int len = stack.size() / 2;
        int[][] res = new int[len][2];
        for (int i = len - 1; i >= 0; i--) {
            res[i][1] = stack.pop();
            res[i][0] = stack.pop();

        }



        return res;
    }

    public static void main(String[] args) {
        int[][] a = {{1,3},{2,6},{8,10},{15,18}};
        int[][] res = merge(a);
        for(int[] x : res){
            for (int y : x){
                System.out.printf(y + " ");
            }
            System.out.println();
        }
    }
}

package MeiTuan_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_one {
    public static int count_star(int[][] stars){
        int ans = 0;

        for (int i = 0; i < stars.length; i++) {
            //up, down,right ,left
            boolean[] lucky_star = new boolean[4];

            //find up
            for (int j = 0; j < stars.length; j++) {
                if(i != j && stars[j][0] == stars[i][0]){
                    if (stars[j][1] > stars[i][1]){
                        lucky_star[0] = true;
                        break;
                    }
                }
            }
            if (lucky_star[0] != true) continue;
            //find down
            for (int j = 0; j < stars.length; j++) {
                if(i != j && stars[j][0] == stars[i][0]){
                    if (stars[j][1] < stars[i][1]){
                        lucky_star[1] = true;
                        break;
                    }
                }
            }
            if (lucky_star[1] != true) continue;

            //find right
            for (int j = 0; j < stars.length; j++) {
                if(i != j && stars[j][1] == stars[i][1]){
                    if (stars[j][1] > stars[i][1]){
                        lucky_star[2] = true;
                        break;
                    }
                }
            }
            if (lucky_star[2] != true) continue;

            //find left
            for (int j = 0; j < stars.length; j++) {
                if(i != j && stars[j][0] == stars[i][0]){
                    if (stars[j][1] < stars[i][1]){
                        lucky_star[3] = true;
                        break;
                    }
                }
            }
            if (lucky_star[3] != true) continue;

            ans ++;

        }


        return ans;
    }








    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        int len = Integer.parseInt(input);
        int [][] nums = new int[len][2];
        for (int i = 0; i < len; i++) {
            input = bf.readLine();
            String[] records = input.split(" ");
            for (int j = 0; j < 2; j++) {
                nums[i][j] = Integer.parseInt(records[j]);
            }
        }

        System.out.println(count_star(nums));

    }

}

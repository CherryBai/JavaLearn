package java_learn;


import java.io.IOException;
import java.util.Scanner;


public class DD_4_test {
    public static int[] count(int[] nums){
        int length = nums.length;
        int[] res = new int[length];
        for(int i = 0; i < res.length;i ++){
            res[i] = 0;
        }

        for(int i = 0; i < length; i++){
            for (int j = i + 1; j < length; j ++){
                if(nums[j] > nums[i]) break;
                else {
                    res[i] ++;
                }
            }

            for (int j = i - 1; j >= 0; j --){
                if(nums[j] > nums[i]) break;
                else {
                    res[i] ++;
                }
            }

        }
        return res;
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[][] b = new int[l][];
        int[][] res = new int[l][];


        int nums_l =sc.nextInt();
            for(int i = 0;i < l ; i++){
                for (int j = 0; j < nums_l;j++){
                    b[i][j] = sc.nextInt();
                }
            }



        for (int[]x : res){
            for (int y : x){
                System.out.print(y);
            }
            System.out.println();
        }

    }


}

package Tecent_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class five {


    public static int find_parent(int[] b){
        int k = b[0];
        int ceng = b[1];
        int k_ceng = 0;
        for (int i = 1; i < k/2; i++) {
            if (Math.pow(2,i) >= k){
                k_ceng = i;
            }
        }

        if (k_ceng <= ceng){
            return -1;
        }
        k = (int) (k / Math.pow(2,k_ceng - ceng));
        return k;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String len_s = bf.readLine();
        int len = Integer.parseInt(len_s);
        int[][] tree = new int[len][2];
        for (int i = 0; i < len; i++) {
            String input = bf.readLine();
            String[] r = input.split(" ");
            for (int j = 0; j < 2; j++) {
                tree[i][j] = Integer.parseInt(r[j]);
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.println(find_parent(tree[i]));
        }

    }
}
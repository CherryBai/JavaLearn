package Tecent_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class three {


    public static int count(int[][] a){
        int res = -1;
        int len = a.length;
        if (len == 0){
            return res;
        }



        return res;
    }





    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        int len = Integer.parseInt(input);
        int[][] a = new int[2][len];
        for (int i = 0; i < 2; i++) {
            input = bf.readLine();
            String[] r = input.split(" ");
            for (int j = 0; j < r.length; j++) {
                a[i][j] = Integer.parseInt(r[j]);
            }
        }


    }
}

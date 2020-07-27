package java_learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class test_myself {

     public static void main(String[] args) throws IOException{
          BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
          String input = bf.readLine();
          int len = Integer.parseInt(input);
          int [][] nums = new int[len][];
          for (int i = 0; i < len; i++) {
               input = bf.readLine();
               String[] records = input.split(" ");
               nums[i] = new int[records.length];

               for (int j = 0; j < records.length; j++) {
                    nums[i][j] = Integer.valueOf(records[j]);
               }
          }

          for (int[] x: nums) {
               for (int y: x) {
                    System.out.print(y + ",");
               }
               System.out.println();
          }
     }

}

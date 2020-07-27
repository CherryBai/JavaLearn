package java_learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multi_line_input {

    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;
        if ((input = bf.readLine()) != null) {
            String[] records = input.split(" ");
            int [] nums = new int[records.length];
            int sum = 0;
            for (int i = 0; i < records.length; i ++) {

                nums[i] = Integer.parseInt(records[i]);
                sum += nums[i];
            }

            System.out.println(sum);

            for (int i = 0; i < records.length; i ++) {
                System.out.println("Input is :" + nums[i]);
            }

        }

    }*/

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入多少个数组。");
        String input = bf.readLine();
        int len = Integer.parseInt(input);
        int [][] nums = new int[len][];
        System.out.println(" 共有" + len + "个数组");
        for (int i = 0; i < len; i++) {
            System.out.println("输入每组数组的内容。");
            input = bf.readLine();
            String[] records = input.split(" ");
            int nums_i_len = records.length;

            nums[i] = new int[nums_i_len];
            System.out.println(i + "数组长度为" + nums_i_len);

            for (int j = 0; j < nums_i_len; j++) {

                nums[i][j] = Integer.valueOf(records[j]);
            }
        }
        for (int[] x: nums) {
            for (int y: x) {

                System.out.print(y + " ");
            }
            System.out.println();
        }



    }


}

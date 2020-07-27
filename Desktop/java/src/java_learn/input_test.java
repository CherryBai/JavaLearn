package java_learn;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    count代表的是输入的几个数组
    res代表二维数组
    length代表每个数组的长度

 */
public class input_test {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input ;
        while((input = bf.readLine()) != null){
            int count = Integer.parseInt(input);
            int[][] res = new int[count][];
            for(int i = 0; i < count; i++){
                input = bf.readLine();
                int length = Integer.parseInt(input);

                input = bf.readLine();
                String[] records = input.split(" ");
                //int length = records.length;

                res[i] = new int[length];
                for (int j = 0; j < length; j++){
                    res[i][j] = Integer.parseInt(records[j]);
                }
            }
            /*
                完成数组res[][]的输入后可以进行函数操作
             */
            for (int[] x : res){
                for (int y : x){
                    System.out.print(y + " ");
                }
                System.out.println();
            }
        }



    }
}

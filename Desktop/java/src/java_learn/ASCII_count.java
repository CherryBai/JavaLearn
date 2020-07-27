package java_learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)，
换行表示结束符，不算在字符里。不在范围内的不作统计。
 */
public class ASCII_count {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input ;
        while ((input = bf.readLine()) != null){
            //input = bf.readLine();
            System.out.println(count(input));
        }
    }
    public static int count(String s){
        int ans = 0;
        int length = s.length();
        boolean[] flag = new boolean[128];
        for(int i = 0; i < length; i ++){
            if(!flag[Integer.valueOf(s.charAt(i))]){
                ans ++;
            }
            flag[Integer.valueOf(s.charAt(i))] = true;
        }

        return ans;
    }
}

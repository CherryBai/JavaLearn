package java_learn;

import java.util.Scanner;

/*
输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 */
public class return_right_to_left {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(r_to_l(input));



    }

    public static int r_to_l(int input){
        int res = 0;
        boolean[] s = new boolean[10];
        while (input != 0){
            int temp = input % 10;
            if (s[temp] == true) {
                input /= 10;
                continue;
            }
            res *= 10;
            res += temp;
            input /= 10;
            s[temp] = true;
        }
        return res;
    }


}

package java_learn;


import java.util.Scanner;


/*
输入一个整数，将这个整数以字符串的形式逆序输出
程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 */
public class num_to_string {


    public static String reverse(long num){
        String temp = new String();
        temp = String.valueOf(num);
        StringBuffer rev = new StringBuffer(temp);
        rev.reverse();


        return rev.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input;
        while (sc.hasNextLine()){
            input = sc.nextLong();
            System.out.println(reverse(input));
        }

    }
}

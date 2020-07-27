package java_learn;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static int lampSum(int l,String r){
        int sum = 0;
        for(int i=0; i<l; i++){
            if(r.charAt(i) == '.'){
                sum ++;
                i+=2;
            }
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String sa = bf.readLine();
        int ca = Integer.valueOf(sa);// 转化包装类
        for(int i=0; i<ca; i++){
            int len = Integer.valueOf(bf.readLine());
            String s = bf.readLine();
            System.out.println(String.valueOf(lampSum(len,s)));
        }
    }
}
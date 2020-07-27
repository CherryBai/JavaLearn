package java_learn;

import java.io.*;

public class sixteen_to_ten{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;
        int len;
        int val=0;
        while((str=br.readLine())!=null){
            str=str.substring(2).toUpperCase();
            val=Integer.parseInt(str,16);
            System.out.println(val);
        }
    }
}

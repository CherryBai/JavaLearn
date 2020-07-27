package java_learn;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Sting_length_8 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String s = br.readLine();
            if(s != null){
                getNewString(s);
            } else {
                break;
            }
        }
    }
    public static void getNewString(String s){
        for(;s.length()>=8;){
            System.out.println(s.substring(0, 8));
            s=s.substring(8);
        }
        if(s.length()<8&&s.length()>0){
            for(int t = 0; t< 8-s.length()/8;t++){
                s+="0";
            }
            System.out.println(s.substring(0,8));
        }
    }
}
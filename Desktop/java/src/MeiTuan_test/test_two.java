package MeiTuan_test;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_two {

    public static String convert(String s){
        StringBuffer ans = new StringBuffer();
        int dot_index = 0;
        boolean find_dot = false;
        if(s.charAt(0) == '-'){
            ans.append("($");
        }else {
            ans.append("$");
        }
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '-'){
                ans.append(s.charAt(i));
            }else {
                continue;
            }
            if (s.charAt(i) == '.'){
                find_dot = true;
                dot_index = s.indexOf('.');
                if(dot_index < s.length() - 3){
                    ans.append(s.charAt(i + 1));
                    ans.append(s.charAt(i + 2));
                    break;
                }else if(dot_index == s.length() - 2){
                    ans.append(s.charAt(i + 1));
                    ans.append("0");
                    break;
                }
            }

        }
        if (find_dot == false){
            ans.append(".00");
        }

        if (s.charAt(0) == '-') ans.append(')');

        int temp = ans.indexOf(".") ;
        //System.out.println("temp is : " + temp);

        if (s.charAt(0) != '-'){
            int count = 0;
            for (int i = temp - 1; i > 0 ; i--) {
                count ++;
                if (count == 3){
                    count = 0;
                    if(i != 1){
                        ans.insert(i ,',');
                    }
                }
            }
        }else {

            int count = 0;
            for (int i = temp - 1; i > 1 ; i--) {
                count ++;
                if (count == 3){
                    count = 0;
                    if(i != 2){
                        ans.insert(i ,',');
                    }
                }
            }
        }






        return ans.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String inptut ;
        while ((inptut = bf.readLine())!= null){
            System.out.println(convert(inptut));
        }

    }
}

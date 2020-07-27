package java_learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerDemo {
    public static void main(String[] args) throws IOException {
        System.out.print("Pls input your number around spaces：");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = (String) br.readLine();
        String[] result = st.split("\\s+");
        int[] last = new int[result.length];
        for (int i = 0; i < result.length; i ++) {
            last[i] = Integer.parseInt(result[i]);
        }

        for(int x : last){
            System.out.println(x);
        }
    }

}
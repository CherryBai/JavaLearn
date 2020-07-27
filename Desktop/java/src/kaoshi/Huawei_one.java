package kaoshi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Huawei_one {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input ;
        while ((input = br.readLine()) != null){
            String[] records = input.split(" ");
            System.out.println( Integer.valueOf(records[0]) + Integer.valueOf(records[1]));
        }
    }
}

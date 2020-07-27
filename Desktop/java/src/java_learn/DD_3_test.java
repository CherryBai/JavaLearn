package java_learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DD_3_test {
    public static int max_cost(int[] a,int[] b){
        int res = 0;
        for(int i = 0; i < b.length; i++){
            for (int j = 0; j < a.length; j++){
                if(b[i] < a[j] && j!=0 ) {
                    res += b[i] - a[j - 1];
                    break;
                }
                if(j == a.length - 1 ){
                    res += b[i] - a[j];
                }
            }
        }

        return res;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String st_l = (String) br.readLine();
        String st_a = (String) br.readLine();
        String st_b = (String) br.readLine();


        String[] result_a = st_a.split("\\s+");
        int[] a = new int[result_a.length];
        for (int i = 0; i < result_a.length; i ++) {
            a[i] = Integer.parseInt(result_a[i]);
        }

        String[] result_b = st_b.split("\\s+");
        int[] b = new int[result_b.length];
        for (int i = 0; i < result_b.length; i ++) {
            b[i] = Integer.parseInt(result_b[i]);
        }

        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(max_cost(a,b));
    }
}

package java_learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zhoahang {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(grayCode(n));
    }

    public static List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(0);
        for (int i = 0; i < n; i++) {
            List<Integer> temp = res;
            for (int j = temp.size() - 1; j >= 0; j--) {
                int t = (int)temp.get(j) + (int)Math.pow(2, i);
                res.add(t);
            }

        }
        return res;
    }

}

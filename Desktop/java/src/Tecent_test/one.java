package Tecent_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class one {


    public static void push(List<Integer> q, int n){
        q.add(n);
    }

    public static void top(List<Integer> q){
        int len = q.size();
        if (len == 0) {
            System.out.println(-1);;
            return;
        }
        System.out.println(q.get(0));
    }

    public static void pop(List<Integer> q){
        int len = q.size();
        if (len == 0) {
            System.out.println(-1);;
        }
        q.remove(0);
    }
    public static int size(List<Integer> q){
        int len = q.size();
        if (len == 0) {
            return -1;

        }
        return q.size();
    }

    public static void clear(List<Integer> q){
        q.removeAll(q);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String len_s  = bf.readLine();
        int len = Integer.parseInt(len_s);


        for (int i = 0; i < len; i++) {
            List<Integer> q = new ArrayList<>();
            String op = bf.readLine();
            int op_nums = Integer.parseInt(op);

            for (int j = 0; j < op_nums; j++) {
                String input = bf.readLine();
                String[] records = input.split(" ");

                if (records[0] == "PUSH"){
                    push(q,Integer.parseInt(records[ i + 1]));
                }
                    if (records[0] == "TOP"){
                        top(q);;
                    }
                    if (records[0] == "SIZE"){
                        System.out.println(size(q));
                    }
                    if (records[0] == "POP"){
                        pop(q);
                    }
                    if (records[0] == "CLEAR"){
                        clear(q);
                    }

            }
        }
    }

}

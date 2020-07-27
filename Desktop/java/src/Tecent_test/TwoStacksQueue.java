package Tecent_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.LinkPermission;
import java.util.Stack;

public class TwoStacksQueue {

    static class Queue<Integer>{
        private Stack<Integer> s1=new Stack<>();
        private Stack<Integer> s2=new Stack<>();

        public void add(Integer val){
            s1.push(val);
        }


        public Integer poll() {
            while (s2.empty()){
                while (!s1.empty()){
                    s2.push(s1.peek());
                    s1.pop();
                }
            }
            Integer val=s2.peek();
            s2.pop();
            while (!s2.empty()){
                s1.push(s2.pop());
            }

            return val;
        }

        public Integer peek(){
            while (s2.empty()){
                while (!s1.empty()){
                    s2.push(s1.peek());
                    s1.pop();
                }
            }
            Integer val=s2.peek();
            while (!s2.empty()){
                s1.push(s2.pop());
            }
            return val;
        }

        public boolean empty(){
            return s1.empty();
        }
    }
//和poll效果一样
//    public int peek() {
//        if (stackPop.empty() && stackPush.empty()) {
//            throw new RuntimeException("Queue is empty!");
//        } else if (stackPop.empty()) {
//            while (!stackPush.empty()) {
//                stackPop.push(stackPush.pop());
//            }
//        }
//        return stackPop.peek();
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String len_s  = bf.readLine();
        int len = Integer.parseInt(len_s);
        Queue<Integer> q = new Queue<Integer>();
        for (int i = 0; i < len; i++) {
            String input = bf.readLine();
            String[] r = input.split(" ");
            if (r[0] == "add"){
                q.add(Integer.parseInt(r[1]));
            }
            if (r[0] == "peek"){
                System.out.println(q.peek());;
            }
            if (r[0] == "poll"){
                q.poll();
            }
        }



    }
}


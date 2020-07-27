package java_learn;

import java.util.Scanner;
import java.util.Stack;

public class DD_test {
    public static int breakNum(int[] nums){
        int res = 0;
        Stack<Integer> s = new Stack();
        for(int i = nums.length - 1; i >= 0; i --){
            if (!s.empty() && s.peek() < nums[i]){
                int t = (nums[i] - 1) / s.peek();
                res += t;
                s.push(nums[i] / (t + 1));
                continue;
            }
            s.push(nums[i]);
        }


        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];

        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }

        System.out.println(breakNum(b));

    }
}

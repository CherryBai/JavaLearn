package kaoshi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class huawei_test_three {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;
        if((input =bf.readLine()) != null){
            String[] records = input.split(" ");
            int stack_num = Integer.parseInt(records[0]);

            int max = 0;
            HashMap<Integer,Integer> stack = new HashMap<Integer, Integer>();
            int[][] stack_exe = new int[stack_num][];

            for (int i = 0; i < stack_num; i ++){
                input = bf.readLine();
                String[] stack_i_info =input.split(" ");
                stack.put(Integer.parseInt(stack_i_info[0]),Integer.parseInt(stack_i_info[1]));

                stack_exe[i] = new int[stack_i_info.length];
                for(int j = 0; j < stack_exe[i].length; j++){
                    stack_exe[i][j] = Integer.parseInt(stack_i_info[j]);
                }



            }
            max =count(stack,stack_exe);



            System.out.println(max);
        }
    }

    public static int count(HashMap<Integer,Integer> stack,int[][] stack_exe){
        int ans = 0;
        /*
        for(int i = 0 ; i < stack_exe.length; i ++){
            for (int j = 0; j < stack_exe[i].length; j ++){
                ans += stack.get(stack_exe[i][j]);
            }
        }

         */
        for(int i = 0; i < stack_exe.length; i ++){
            for(int j = 2; j < stack_exe[i].length; j++){
                ans = Math.max(ans,find(stack,stack_exe[i][j],stack_exe));
            }
        }
        return ans;
    }

    public static int find(HashMap<Integer,Integer> stack,int loc,int[][] stack_exe){
        int ans = 0;
        for(int i = 0 ; i < stack_exe[loc].length; i ++){
            if(i == loc ) continue;
            ans += stack.get(loc) + find(stack,i,stack_exe);
        }
        return ans;
    }
}

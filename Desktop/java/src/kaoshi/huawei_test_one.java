package kaoshi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class huawei_test_one {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;
        if((input =bf.readLine()) != null){
            String[] records = input.split(",");
            System.out.println(count(records));

        }
    }

    public static String count(String[] s){
        String name = s[0];
        int length = s.length;
        HashMap<String,Integer> vote = new HashMap<String, Integer>();
        for (int i = 0; i < length; i ++){
            vote.put(s[i],vote.getOrDefault(s[i],0) + 1);
        }

        Integer max = vote.get(s[0]);
        for (String temp : vote.keySet()){
            if(max < vote.get(temp)){
                name = temp;
            }else if(max == vote.get(temp)){

                    name = change_a_to_b(name,temp);

            }
        }

        return name;
    }

    public static String change_a_to_b(String a, String b){
        int length_a = a.length();
        int length_b = b.length();
        for(int i = 0; i < Math.min(length_a,length_b); i++){
            if(b.charAt(i) < a.charAt(i)) {
                return b;
            }
        }

        if(length_a < length_b){
            return a;
        }else {
            return b;
        }

    }
}

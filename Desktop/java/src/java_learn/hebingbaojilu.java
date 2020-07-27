package java_learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
/*

据表记录包含表索引和数值（int范围的整数），请对表索引相同的记录进行合并
，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。


 */
public class hebingbaojilu {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = bfr.readLine()) != null) {
            int count = Integer.parseInt(input);
            Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

            for (int i = 0; i < count; i++) {

                input=bfr.readLine();

                String[] records = input.split(" ");
                Integer key = Integer.parseInt(records[0]);
                Integer value = Integer.parseInt(records[1]);
                Integer current = map.get(key);
                map.put(key, (current == null ? 0 : current) + value);
            }


            StringBuilder result = new StringBuilder();
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                result.append(entry.getKey());
                result.append(" ");
                result.append(entry.getValue());
                result.append("\r");
            }

            System.out.println(result);
        }
    }
}

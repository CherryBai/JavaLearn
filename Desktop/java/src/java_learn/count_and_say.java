package java_learn;

public class count_and_say {
    public static String countAndSay(int n) {
        StringBuffer ans = new StringBuffer();
        int count = 0;
        if(n <= 0){
            return null;
        }
        if(n == 1){
            return "1";
        }

        String Last_return = countAndSay(n - 1);

        for(int i = 0; i < Last_return.length() - 1; i ++){
            if (Last_return.charAt(i) == Last_return.charAt(i + 1)){
                count ++ ;
            }else {
                ans.append(count + '0');
                ans.append(Last_return.charAt(i));
                count = 0;
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String ans = countAndSay(3);
        System.out.println(ans);
    }
}

package sword_to_offer;
/*
请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100"、"5e2"、"-123"、"3.1416"、
"0123"都表示数值，但"12e"、"1a3.14"、"1.2.3"、"+-5"、"-1E-16"及"12e+5.4"都不是。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/biao-shi-shu-zhi-de-zi-fu-chuan-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class offer_20_isNumber {
    public boolean isNumber(String s) {
        if (s == null){
            return false;
        }
        int sign_flag = 0;
        int e_falg = 0;
        int dot_flag = 0;
        int alphabet_or_symbol_flag = 0;
        if (s.charAt(0) == '.' || !(s.charAt(0) <= '9' && s.charAt(0) >= '0')){
            return false;
        }


        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (tmp == '+' || tmp == '-'){
                sign_flag ++;
                continue;
            }
            if (tmp == 'e'){
                e_falg ++;
                continue;
            }
            if (tmp == '.'){
                dot_flag ++;
                continue;
            }
            if (!(tmp == 'e' || tmp == '.' || (tmp <= '9' && tmp >= '0'))){
                alphabet_or_symbol_flag ++;
            }

            if (alphabet_or_symbol_flag > 0){
                return false;
            }
            if (sign_flag > 1 || dot_flag > 1 || e_falg > 1){
                return false;
            }

        }

        return true;
    }

}

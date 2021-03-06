package java_learn;

import java.util.Stack;

/*
以 Unix 风格给出一个文件的绝对路径，你需要简化它。或者换句话说，将其转换为规范路径。

在 Unix 风格的文件系统中，一个点（.）表示当前目录本身；此外，两个点 （..） 
表示将目录切换到上一级（指向父目录）；两者都可以是复杂相对路径的组成部分。更多信息请参阅：Linux / Unix中的绝对路径 vs 相对路径

请注意，返回的规范路径必须始终以斜杠 / 开头，并且两个目录名之间必须只有一个斜杠 /。最后一个目录名（如果存在）不能以 / 结尾。
此外，规范路径必须是表示绝对路径的最短字符串。



来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/simplify-path
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LC_71_simplifyPath {
    public static String simplifyPath(String path) {
            Stack<String> stack = new Stack<>();
            // 首先将字符串以 “/” 分隔存储到新的字符数组 str 中
            String[] str = path.split("/");
            for (String s : str) {
                // 如果数组非空,且访问到的是 “..” 则说明要返回上一级,要将当前元素出栈
                if ( s.equals("..") ) {
                    // 这里用到增强型 for 循环不能同时判断，需要再次判空
                    // 而普通 for 循环则可写成( !stack.isEmpty() && s.equals("..") )
                    if ( !stack.isEmpty() ) {
                        stack.pop();
                    }
                    // 如果数组非空并且当前元素不是 “.” 说明当前元素是路径信息，要入栈
                } else if ( !s.equals("") && !s.equals(".") ) {
                    stack.push(s);
                }
            }
            // 如果栈内没有元素说明没有路径信息，返回 “/” 即可
            if ( stack.isEmpty() ) {
                return "/";
            }
            // 这里用到 StringBuilder 操作字符串，效率高
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < stack.size(); i++) {
                ans.append( "/" + stack.get(i) );
            }
            return ans.toString();
    }


    public static void main(String[] args) {
        String s = "/../fadf/adfsag///..//../";
        System.out.println(simplifyPath(s));
    }

}

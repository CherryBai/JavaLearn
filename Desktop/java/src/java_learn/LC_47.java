package java_learn;

import java.util.*;
/*给定一个可包含重复数字的序列，返回所有不重复的全排列。

        示例:

        输入: [1,1,2]
        输出:
        [
        [1,1,2],
        [1,2,1],
        [2,1,1]
        ]

        来源：力扣（LeetCode）
        链接：https://leetcode-cn.com/problems/permutations-ii
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/


public class LC_47 {
    public static List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int[] visited = new int[nums.length];
        backtrack(res, nums, new ArrayList<Integer>(), visited);
        return res;

    }

    private static void backtrack(List<List<Integer>> res, int[] nums,
                                  ArrayList<Integer> tmp, int[] visited) {
        if (tmp.size() == nums.length) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {

            if (visited[i] == 1) continue;
            if(i > 0 && nums[i] == nums[i - 1] && visited[i - 1] == 0) continue;
            visited[i] = 1;
            tmp.add(nums[i]);
            backtrack(res, nums, tmp, visited);
            visited[i] = 0;
            tmp.remove(tmp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {3,3,0,3};
        List<List<Integer>> res  = permuteUnique(a);
        Iterator it = res.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}

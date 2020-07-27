package java_learn;

import java.util.*;

public class combine_sum_LC39 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int len = candidates.length;

        // 排序是为了提前终止搜索
        Arrays.sort(candidates);

        dfs(candidates, len, target, 0, new ArrayDeque<>(), res);
        return res;
    }

    /**
     * @param candidates 数组输入
     * @param len        输入数组的长度，冗余变量
     * @param residue    剩余数值
     * @param begin      本轮搜索的起点下标
     * @param path       从根结点到任意结点的路径
     * @param res        结果集变量
     */
    private static void dfs(int[] candidates,
                     int len,
                     int residue,
                     int begin,
                     Deque<Integer> path,
                     List<List<Integer>> res) {
        if (residue == 0) {
            // 由于 path 全局只使用一份，到叶子结点的时候需要做一个拷贝
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = begin; i < len; i++) {

            // 在数组有序的前提下，剪枝
            if (residue - candidates[i] < 0) {
                break;
            }

            path.addLast(candidates[i]);
            dfs(candidates, len, residue - candidates[i], i, path, res);

            for(Integer x :path){
                System.out.print(x);
            }
            System.out.println();

            System.out.print("remove " + path.getLast());
            path.removeLast();
            System.out.println();


        }
    }

    public static void main(String[] args) {
        int[] candidate = {1,2,3};
        int traget = 5;
        List<List<Integer>>res = combinationSum(candidate,traget);
        for(List l : res){
            for(Object x : l){
                System.out.print(x);
            }
            System.out.println();
        }

    }
}
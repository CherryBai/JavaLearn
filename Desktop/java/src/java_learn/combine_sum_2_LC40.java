package java_learn;

import java.util.*;

public class combine_sum_2_LC40 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int len = candidates.length;

        List<Integer> new_candidates = new LinkedList<>();
        for(int x: candidates){
            new_candidates.add(x);
        }
        dfs(new_candidates,target,new ArrayDeque<>(),res);
        return res;
    }

    public static  void dfs(List<Integer> candidates, int target,
                            Deque<Integer> path, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i : candidates) {

            // 在数组有序的前提下，剪枝
            if (target - i < 0) {
                break;
            }

            path.addLast(i);
            candidates.remove(i);
            dfs(candidates, target - i, path, res);

           for(Integer x :path){
                System.out.print(x);
            }
            System.out.println();

            System.out.print("remove " + path.getLast());
            path.removeLast();
            candidates.add(i);
//            System.out.println();

        }

    }

    public static void main(String[] args) {
        int[] candidate  = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> res = combinationSum2(candidate,target);
        for(List l : res){
            for(Object x : l){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}

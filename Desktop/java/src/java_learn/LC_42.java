package java_learn;


/*给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。*/

public class LC_42 {
    public static int trap(int[] height) {
        int res = 0;
        int left = 0;
        int right = 0;
        int len = height.length;
        if(len == 0) return res;
        while(left < len - 1) {
            if (height[left] <= height[left + 1]) {
                left++;
                continue;
            }
            right = find_max_rigth(height, left);
            res += Math.min(height[left], height[right]) * (right - left - 1);
            for (int i = left + 1; i < right; i++) {
                res -= height[i];
            }
            left = right;
        }
        return res;
    }

    public static int find_max_rigth(int[] height, int start){
        int len = height.length;
        int max_right_index = start + 1;

        int max = height[max_right_index];
        for (int i = max_right_index; i < len; i ++){
            if(height[i] > height[start]){
                return i;
            }
            if(height[i] >= max ){
                max_right_index = i;
                max = height[i];
            }
        }


        return max_right_index;
    }

    public static int trap_new(int[] height) {
        int sum = 0;
        int[] max_left = new int[height.length];
        int[] max_right = new int[height.length];

        for (int i = 1; i < height.length - 1; i++) {
            max_left[i] = Math.max(max_left[i - 1], height[i - 1]);
        }
        for (int i = height.length - 2; i >= 0; i--) {
            max_right[i] = Math.max(max_right[i + 1], height[i + 1]);
        }
        for (int i = 1; i < height.length - 1; i++) {
            int min = Math.min(max_left[i], max_right[i]);
            if (min > height[i]) {
                sum = sum + (min - height[i]);
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] a = {4,2,3};
        System.out.println("sum is : " + trap_new(a));
    }
}

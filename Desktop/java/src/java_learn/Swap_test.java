package java_learn;

public class Swap_test {
    public static void swap(int[] nums,int a, int b){
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }
    public static void main(String[] args) {
        int [] a = {1,2};
        swap(a,0,1);
        for (int x : a
             ) {
            System.out.println(x);
        }
    }
}

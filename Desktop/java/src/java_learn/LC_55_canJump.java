package java_learn;

public class LC_55_canJump {

    public static boolean canJump(int[] nums){
        int k = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (i > k) return false;
            k = Math.max(k, i + nums[i]);
        }
        return true;

    }

    public static void main(String[] args) {
        int[] a ={3,2,1,0,4};
        int[] b ={2,3,1,1,4};
        System.out.println(canJump(a));
        System.out.println(canJump(b));
    }


}

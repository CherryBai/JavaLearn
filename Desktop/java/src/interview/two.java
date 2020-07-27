package interview;

public class two {
    public int removeElement(int[] nums, int val) {
        /*int slow_point = 0;
        boolean[] visted = new boolean[nums.length];

        while (slow_point < nums.length){
            if (nums[slow_point] == val || visted[slow_point]){
                int fast_point = slow_point + 1;
                if (fast_point >= nums.length ){
                    return slow_point - 1;
                }
                while (nums[fast_point] == val && visted[fast_point] == false && fast_point < nums.length - 1){
                    fast_point ++;
                }


                nums[slow_point] = nums[fast_point];
                visted[fast_point] = true;

            }

            slow_point ++;


        }
        return slow_point;*/
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[len++] =  nums[i];
            }
        }
        return len;
    }


}

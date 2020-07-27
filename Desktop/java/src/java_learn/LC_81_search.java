package java_learn;

public class LC_81_search {
    public boolean search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return true;
            }
        }
        return false;
    }

}

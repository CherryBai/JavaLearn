package interview;

public class one {



    public int search(int[] nums, int target) {
        int res = 0;
        int left = 0;
        int right = nums.length - 1;
        res = div_two(nums, left, right, target);
        return res;
    }

    public int div_two(int[] nums, int left, int right, int target){
        if (left > right){
            return -1;
        }

        int mid_idx = (left + right) / 2;

        if (nums[mid_idx] == target) return mid_idx;
        if (nums[mid_idx] > target) return div_two(nums, left, mid_idx - 1, target);
        if (nums[mid_idx] < target) return div_two(nums, mid_idx + 1, right, target);

        return -1;
    }



}

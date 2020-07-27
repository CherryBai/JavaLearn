package java_learn;

public class Search_target {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;

        while(left <= right){
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target){
                right = mid - 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            mid = (left + right) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {3,4,5,5,5,5,5,6,6,7};
        int target = 10;
        System.out.println(search(a,target));
    }

}

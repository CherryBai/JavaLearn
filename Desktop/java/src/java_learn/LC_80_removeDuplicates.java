package java_learn;

/*

给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。

不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

示例 1:

给定 nums = [1,1,1,2,2,3],

函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。

你不需要考虑数组中超出新长度后面的元素。
示例 2:

给定 nums = [0,0,1,1,1,1,2,3,3],

函数应返回新长度 length = 7, 并且原数组的前五个元素被修改为 0, 0, 1, 1, 2, 3, 3 。

你不需要考虑数组中超出新长度后面的元素。
 */

public class LC_80_removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        int len = nums.length;
        if (len == 0){
            return 0;
        }
        int idx_fast = 1;
        int idx_slow = 0;

        while (idx_fast < len){
            if (nums[idx_fast] == nums[idx_slow]){
                idx_fast ++;
                continue;
            }
            if (idx_slow >= idx_fast && (idx_slow + 1) < len){
                idx_fast = idx_slow + 1;
            }
            if (idx_slow + 2 < len){
                idx_slow += 2;
                nums[idx_slow] = nums[idx_fast];

            }


            idx_fast ++;
        }

        return idx_slow + 1;
    }


    public static void main(String[] args) {
        int[] a = {1,1,1,2,2,3};
        int len = removeDuplicates(a);
        for (int i = 0; i < len; i++) {
            System.out.printf(" " + a[i]);
        }
    }

}

package java_learn;

/*
给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
说明:

初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 

示例:

输入:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

输出: [1,2,2,3,5,6]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/merge-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class LC_88_merge {
    /*public void merge(int[] nums1, int m, int[] nums2, int n){
        int len = m;
        int m_index = 0;
        int n_index = 0;
        while (m_index < len && n_index < n){
            if (nums2[n_index] > nums1[m_index]){
                m_index ++;
            }
            else {

                insert(nums1, m_index, len, nums2[n_index]);
                len ++ ;
                m_index ++ ;
                n_index ++;
            }


        }
        if (n_index != n){
            for (int i = n_index; i < n; i++) {
                nums1[m_index] = nums2[i;
                m_index ++;
            }
        }

    }

    public void insert(int[] nums1, int loc, int len, int nums){
        for (int i = len; i >= loc ; i--) {
            nums1[i] = nums1[i - 1];

        }
        nums1[loc] = nums;
    }*/

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m;
        int m_index = 0;
        int n_index = 0;
        if(n == 0){
            return;
        }
        while (m_index < len && n_index < n){
            if (nums1[m_index] < nums2[n_index]){
                m_index ++;
            }else {
                insert(nums1, nums2[n_index], m_index,len - 1);
                len ++;
                m_index ++;
                n_index ++;
            }
        }
        if (n_index != n){
            for (int i = n_index; i < n; i++) {
                nums1[m_index ] = nums2[i];
                m_index ++;
            }
        }


    }
    public void insert(int[] nums, int new_num,int loc, int len){
        for (int i = len; i >= loc; i--) {
            nums[i + 1] = nums[i];
        }
        nums[loc] = new_num;


    }
}

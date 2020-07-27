package java_learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeeCode_18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length <= 3) return res;
        Arrays.sort(nums);
        int left = 0 ;
        int right = nums.length - 1;
        int i = left + 1;
        int j = right - 1;
        int sum = nums[left] + nums[i] + nums[j] + nums[right];
        if(nums.length == 4){
            if(sum == target){
                res.add(Arrays.asList(nums[left],nums[i],nums[j],nums[right]));

            }
            return res;
        }

        while(right - left >= 3 ){
            i = left + 1;
            j = right - 1;
            System.out.println("i is :" + i);
            System.out.println("j is :" + j);
            while(j > i){
                System.out.println("in ' i - j' i is :" + i);
                System.out.println("in ' i - j' j is :" + j);
                sum = nums[left] + nums[i] + nums[j] + nums[right];
                System.out.println("in ' i - j' sum is :" + sum);
                if(sum == target){
                    res.add(Arrays.asList(nums[left],nums[i],nums[j],nums[right]));
                    i++;
                    j--;
                }
                if(sum > target){
                    while(nums[j] == nums[j - 1]){
                        j--;
                    }
                    j--;
                }
                if(sum < target){
                    while(nums[i] == nums[i + 1]){
                        i ++;
                    }
                    i++;
                }
            }
            if (sum == target){
                right--;
                left++;
            }
            else if(sum < target){
                while(nums[left] == nums[left + 1]){
                    left++;
                }
                left ++;
            }
            else if(sum > target){
                while(nums[right] == nums[right - 1]){
                    right--;
                }
                right --;
            }

        }

        return res;
    }



    public static  void main(String[] args){
        int[] nums = {-3,-1,0,2,4,5};
        System.out.println(fourSum(nums,2).toString());

    }



}

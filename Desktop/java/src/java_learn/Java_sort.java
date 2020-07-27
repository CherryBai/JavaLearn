package java_learn;

public class Java_sort {
    /*
    　1）冒泡排序

　　a、冒泡排序，是通过每一次遍历获取最大/最小值

　　b、将最大值/最小值放在尾部/头部

　　c、然后除开最大值/最小值，剩下的数据在进行遍历获取最大/最小值

　　d、代码实现


     */
    public static void maopao(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]){
                    swap(nums,j,j + 1);
                }
            }
        }

    }
    /*


    2）选择排序

　　a、将第一个值看成最小值

　　b、然后和后续的比较找出最小值和下标

　　c、交换本次遍历的起始值和最小值

　　d、说明：每次遍历的时候，将前面找出的最小值，看成一个有序的列表，后面的看成无序的列表，然后每次遍历无序列表找出最小值。

　　e、代码实现
     */

    public static void xuanze(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int index = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (min > nums[j]){
                    min = nums[j];
                    index = j;
                }
            }
            swap(nums, i, index);
        }

    }

    /*
    　3）插入排序

　　a、默认从第二个数据开始比较。

　　b、如果第二个数据比第一个小，则交换。然后在用第三个数据比较，如果比前面小，则插入（交换）。否则，退出循环

　　c、说明：默认将第一数据看成有序列表，后面无序的列表循环每一个数据，如果比前面的数据小则插入（交换）。否则退出。

     */

    public static void charu(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j --) {
                if (nums[j] < nums[j - 1]){
                    swap(nums, j, j - 1);
                }else {
                    break;
                }
            }
        }
    }


    /*
    4）希尔排序（插入排序变种版）

　　a、基本上和插入排序一样的道理

　　b、不一样的地方在于，每次循环的步长，通过减半的方式来实现

　　c、说明：基本原理和插入排序类似，不一样的地方在于。通过间隔多个数据来进行插入排序。

　　d、代码实现
     */

    public static void xier(int[] nums){
        for (int i = nums.length / 2; i > 0 ; i /= 2) {
            for (int j = i; j < nums.length; j++) {
                for (int k = j; k > 0 && k - i >= 0 ; k -= i) {
                    if (nums[k] < nums[k - i]){
                        swap(nums, k, k - i);
                    }else {
                        break;
                    }
                }
            }

        }
    }

    public static void hill(int[] a){
        int len  = a.length;
        for (int i = len / 2; i > 0 ; i /= 2) {
            for (int j = i; j < len; j++) {
                for (int k = i; k > 0 && k - i> 0 ; k -= i) {
                    if (a[k] < a[k - i]){
                        swap(a,k,k - i);
                    }
                }
            }

        }
    }

    /*
    　5）快速排序

　　a、确认列表第一个数据为中间值，第一个值看成空缺（低指针空缺）。

　　b、然后在剩下的队列中，看成有左右两个指针（高低）。

　　c、开始高指针向左移动，如果遇到小于中间值的数据，则将这个数据赋值到低指针空缺，并且将高指针的数据看成空缺值（高指针空缺）。然后先向右移动一下低指针，并且切换低指针移动。

　　d、当低指针移动到大于中间值的时候，赋值到高指针空缺的地方。然后先高指针向左移动，并且切换高指针移动。重复c、d操作。

　　e、直到高指针和低指针相等时退出，并且将中间值赋值给对应指针位置。

　　f、然后将中间值的左右两边看成行的列表，进行快速排序操作。


     */


    public static void diaoyongkuaisu(int[] nums){
        int low = 0;
        int high = nums.length - 1;
        kuaisupaixu(nums, low, high);

    }
    public static void kuaisupaixu(int[] nums, int low, int high){
        //指针在同一位置，返回
        if (high - low < 1){
            return;
        }
        //标记是从high还是从low开始，默认是high
        boolean flag = true;
        //记录指针的位置
        int left = low;
        int right = high;
        //默认中间值为低指针第一个值
        int midValue = nums[low];

        while (low != high){
            //高指针移动
            if(flag){
                //如果列表右方的数据大于中间值，则向左移动
                if (nums[high] > midValue){
                    high --;
                } else if (nums[high] < midValue){
                    //如果小于，则覆盖最开始的低指针，并且移动低指针，标志位改成从低指针开始移动
                    nums[low] = nums[high];
                    low ++;
                    flag = false;
                }
            }else {
                //如果低指针数小于中间值，则低指针向右移动
                if (nums[low] < midValue){
                    low ++;
                }else if (nums[low] > midValue){
                    //如果低指针的值大于中间值，则覆盖高指针停留时的数据，
                    // 并向左移动高指针。切换为高指针移动
                    nums[high] = nums[low];
                    high --;
                    flag = true;
                }

            }

        }
        //指针位置相同的时候，找到了中间值的位置。
        nums[low] = midValue;
        //然后出现有，中间值的左边小于中间值，右边大于中间值
        //然后对左右两边再进行快速排序
        kuaisupaixu(nums, left, low - 1);
        kuaisupaixu(nums, low + 1, right);

    }


    public static void re_quick(int[] a){
        int low = 0;
        int high = a.length - 1;
        quick_sort(a, low, high);

    }

    public static void quick_sort(int[] a, int low, int high){
        if (high - low < 1){
            return;
        }
        boolean flag = true;
        int left = low;
        int right = high;
        int mid_value = a[low];

        while (left != right){
            if (flag){
                if (a[right] > mid_value ){
                    right --;
                }else {
                    a[left] = a[right];
                    flag = false;
                    left ++;
                }
            }else {
                if (a[left] < mid_value){
                    left ++;
                }else {
                    a[right] = a[left];
                    flag = true;
                    right --;
                }

            }

        }

        a[left] = mid_value;

        quick_sort(a, low, left - 1);
        quick_sort(a, left + 1, high);
    }





    /*
    6）归并排序

　　a、将列表按照对等的方式进行拆分

　　b、拆分小最小快的时候，在将最小块按照原来的拆分，进行合并

　　c、合并的时候，通过左右两块的左边开始比较大小。小的数据放入新的块中

　　d、说明：简单一点就是先对半拆成最小单位，然后将两半数据合并成一个有序的列表。
     */
    public static void diaoyongguibing(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        guibingpaixu(nums, start, end);
    }


    public static void guibingpaixu(int[] nums, int start, int end){
        //判断拆分的不为最小的单位
        if (end - start > 0){
            //再一次拆分，直到拆分成一个数据
            guibingpaixu(nums, start, (start + end) / 2);
            guibingpaixu(nums, (start + end) / 2 + 1, end);
            //记录开始 + 结束位置
            int left = start;
            int right = (start + end) / 2 + 1;
            //记录每个小单位的排序结果
            int index = 0;
            int[] result = new int[end - start + 1];
            //如果查分后的两块数据都还存在
            while (left <= (start + end) / 2 && right <= end){
                //比较两块数据的大小，然后赋值，并且移动下标
                if (nums[left] <= nums[right]){
                    result[index] = nums[left];
                    left ++;
                }else {
                    result[index] = nums[right];
                    right ++;
                }

                index++;
            }


            //当某一块数据不存在了
            while (left <= (start + end) / 2 || right<= end){
                //直接赋值到记录下标
                if(left <= (start + end) / 2){
                    result[index] = nums[left];
                    left ++;
                }else {
                    result[index] = nums[right];
                    right ++;
                }
                index ++;
            }

            for (int i = start; i <= end ; i++) {
                nums[i] = result[i - start];
            }
        }
    }





    //主函数
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {
        int[] nums = {7, 5, 3, 2, 4, 1, 8, 9, 6};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();
        re_quick(nums);


        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
    }
}

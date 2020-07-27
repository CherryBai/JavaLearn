package MeiTuan_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
时间限制：C/C++语言 2000MS；其他语言 4000MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
现在有n名选手进行轮流报数，选手按顺序编号为1~n，另外我们会给出一个序列A，游戏会进行n轮，每轮会出局一名选手，第i轮淘汰的选手最后的排名是n-i+1,即第一轮出局的是倒数第一。出局的选手不会参与下一轮报数。

每轮游戏都是从第一个选手开始报数，即如果1号选手仍在，则从1号选手开始，否则从2号选手开始，以此类推，但是注意，每轮报数是从0开始的，第i轮时，第一个报到A[i]的选手会出局，且当前轮游戏结束。A[i]有可能大于当前的剩余人数，则最后一个人报完以后，会由第一个人接着报，直到报出A[i]。

输入
输入第一行包含一个正整数n，表示有n名选手。(1<=n<=100000)

输入第二行包含n个正整数，表示序列A。(0<=A[i]<=10^9)

输出
输出包含n行，每行一个正整数，第i行的正整数表示i号选手的排名是多少。即输出是一个1~n的排列。


样例输入
4
1 2 1 2
样例输出
1
4
2
3

提示
样例解释，
第一轮中，1-4号选手报数分别是0，1，+，+（+代表未报数），因为A[1]=1，所以2号选手出局，排名为4。
第二轮中，1-4号选手报数为0，-，1，2（-代表一出局），因为A[2]=2,所以4号选手出局，排名为3。
第三轮中，1-4号选手报数为0，-，1，-，因为A[3]=1，所以3号选手出局，排名为2。
第四轮只有1号选手了，所以他会报所有的数字，最后出局。
 */
public class test_three {
    public static int[] baoshu(int[] a){
        int len = a.length;
        int[] ans = new int[len];
        int paiming = len;
        boolean[] taotai = new boolean[len];
        HashMap <Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(i,0);
        }

        //System.out.println(map.keySet().size());
        for (int i = 0; i < len; i++) {
            int count = 0;
            int j = 0;
            while (map.keySet().size() == (len - i)){
                if(j == len){
                    j = 0;
                }
                if (taotai[j] == true){
                    j ++;

                    continue;
                }
                if (a[i] == count){
                    taotai[j] = true;
                    ans[j] = paiming;
                    paiming --;
                    map.remove(j);
                }
                j ++;
                count ++;


            }
        }

        return ans;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while((input = bf.readLine()) != null) {
            int len = Integer.parseInt(input);
            int[] nums = new int[len];
            input = bf.readLine();
            String[] records = input.split(" ");
            for (int i = 0; i < records.length; i++) {
                nums[i] = Integer.parseInt(records[i]);
            }
            int[] res = baoshu(nums);
            for (int a : res) {
                System.out.println(a);
            }
        }
    }
}

package java_learn;



import java.util.Scanner;
import java.util.TreeSet;

public class Ming_random_num {
    public static void main(String[] args) {
        System.out.println("plz intput the random");
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){

            TreeSet<Integer> set=new TreeSet<Integer>();
            int n=sc.nextInt();
            if(n>0){
                for(int i=0;i<n;i++){
                    set.add(sc.nextInt());
                }
            }
            for(Integer i:set){
                System.out.println(i);
            }
        }
    }
}
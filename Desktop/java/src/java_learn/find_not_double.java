package java_learn;

public class find_not_double {
    public static int find_nd(int[] a){
        int len = a.length;
        int res = a[0];
        for (int i = 1; i < len; i++) {
            res ^= a[i];
        }


        return res;
    }

    public static void main(String[] args) {
        int[] a = {2,1,3,1,4,5,3,4,5};
        System.out.println(find_nd(a));
        int b = 2;
        int c = 1;
        System.out.println("b ^ c = " + (b ^ c));



    }
}

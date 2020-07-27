package Tecent_test;

public class test {

    public static void main(String[] args) {
        int k = 10;
        int ceng = 4;
        int k_ceng = 0;
        for (int i = 1; i < k/2; i++) {
            if (Math.pow(2,i) >= k){
                k_ceng = i;
            }
        }

        if (k_ceng <= ceng){
            System.out.println(-1);;
        }
        k = (int) (k / Math.pow(2,k_ceng - ceng));
        System.out.println(k);
    }
}

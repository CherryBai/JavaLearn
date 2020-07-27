package Tecent_test;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class two {

    public static float count_min(int[][] a, int[][] b){
        float res = count_distance(a[0],b[0]);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                res = Math.min(count_distance(a[i],b[j]),res);
            }
        }

        return res;
    }

    public static float count_distance(int[] a, int[]b){
        float distance = 0;

        distance = (float) Math.sqrt(Math.pow((a[0] - b[0]),2) + Math.pow((a[0] - b[0]),2));

        return distance;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        int zu = Integer.parseInt(input);
        float[] res = new float[zu];

        for (int k = 0; k < zu; k++) {
            String n = bf.readLine();
            int len = Integer.parseInt(n);
            int[][] a = new int[len][2];
            int[][] b = new int[len][2];

            for (int i = 0; i < len; i++) {
                String input_a = bf.readLine();
                String[] A = input_a.split(" ");
                for (int j = 0; j < A.length; j++) {
                    a[i][j] = Integer.parseInt(A[j]);
                }
            }

            for (int i = 0; i < len; i++) {
                String input_b = bf.readLine();
                String[] B = input_b.split(" ");
                for (int j = 0; j < B.length; j++) {
                    b[i][j] = Integer.parseInt(B[j]);
                }
            }

            res[k] = count_min(a,b);

        }
        for (int i = 0; i < zu; i++) {
            System.out.printf("%.3f",res[i]);
        }

    }
}

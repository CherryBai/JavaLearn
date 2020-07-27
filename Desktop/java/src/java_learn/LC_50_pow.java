package java_learn;

public class LC_50_pow {
    public double myPow(double x, int n) {
        if(x == 0 ) return 0;
        if(n == 0) return 1;
        return Math.pow(x,n);
    }

}

/**
 * Created by MH on 8/3/2017.
 * Implement pow(x, n).
 */
public class Pow {
    public double myPow(double x, int n) {
        if(n<0) return 1/power(x,n);
        else return power(x,n);
    }

    public double power(double x,int n){
        if(n==0) return 1;
        double tmp = power(x,n/2);
        if(n%2==0){
            return tmp*tmp;
        } else {
            return tmp*tmp*x;
        }
    }
}

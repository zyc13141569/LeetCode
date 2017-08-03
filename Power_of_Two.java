/**
 * Created by MH on 8/3/2017.
 * Given an integer, write a function to determine if it is a power of two.
 */
public class Power_of_Two {
    public boolean isPowerOfTwo(int n) {
        int stop = n;
        for(int i = 0; i < stop; i++){
            if(Math.pow(2,i) > n) return false;
            if(Math.pow(2,i) == n) return true;
        }
        return false;
    }
}

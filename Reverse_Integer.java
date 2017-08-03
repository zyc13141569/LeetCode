/**
 * Created by MH on 8/3/2017.
 *
 Reverse digits of an integer.

 Example1: x = 123, return 321
 Example2: x = -123, return -321
 */
public class Reverse_Integer {
    public int reverse(int x) {
        int result =0;
        while(x!=0){
            int tmp=result*10+x%10;
            x=x/10;
            if(tmp/10!=result){
                result=0;
                break;
            }
            result=tmp;
        }
        return result;
    }
}

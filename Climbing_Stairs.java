/**
 * Created by MH on 8/3/2017.
 * You are climbing a stair case. It takes n steps to reach to the top.

 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class Climbing_Stairs {
    public int climbStairs(int n) {
        if(n<=1){
            return 1;
        } else {
            int a=1,b=1,c=0;
            for(int i=2;i<=n;i++){
                c=a+b;
                b=a;
                a=c;
            }
            return c;
        }
    }
}

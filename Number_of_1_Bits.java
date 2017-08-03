/**
 * Created by MH on 8/3/2017.
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

 For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 */
public class Number_of_1_Bits {
    public int hammingWeight(int n) {
        int bit = 0;
        int mask = 1;
        for(int i=0;i<32;i++){
            if((n&mask)!=0){
                bit++;
            }
            mask <<= 1;
        }
        return bit;
    }
}

/**
 * Created by MH on 8/3/2017.
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */
public class Single_Number {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i=0;i<nums.length;i++) res^=nums[i];
        return res;
    }
}

/**
 * Created by MH on 8/3/2017.
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

 Note:
 1. You must do this in-place without making a copy of the array.
 2. Minimize the total number of operations.
 Credits:
 Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.


 */
public class Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }else{
                nums[i-count]=nums[i];
            }
        }
        for(int i=0;i<count;i++){
            nums[nums.length-count+i]=0;
        }
    }
}

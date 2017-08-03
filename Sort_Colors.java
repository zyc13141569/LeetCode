/**
 * Created by MH on 8/3/2017.
 Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

 Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

 Note:
 You are not suppose to use the library's sort function for this problem.
 */
public class Sort_Colors {
    public void sortColors(int[] nums) {
        int[] count = {0,0,0};
        for(int i = 0; i < nums.length; i++){
            switch(nums[i]){
                case 0:
                    count[0]++;
                    break;
                case 1:
                    count[1]++;
                    break;
                case 2:
                    count[2]++;
                    break;
                default:
                    break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < count[0]) nums[i] = 0;
            if (i >= count[0] && i < (count[1] + count[0])) nums[i] = 1;
            if (i >= (count[1] + count[0]) && i < (count[1] + count[0] + count[2])) nums[i] = 2;
        }
    }
}

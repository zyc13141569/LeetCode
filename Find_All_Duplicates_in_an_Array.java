import java.util.ArrayList;
import java.util.List;

/**
 * Created by MH on 8/3/2017.
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 Find all the elements that appear twice in this array.
 Could you do it without extra space and in O(n) runtime?

 Example:
 Input:
 [4,3,2,7,8,2,3,1]

 Output:
 [2,3]

 */
public class Find_All_Duplicates_in_an_Array {
    public List<Integer> findDuplicates(int[] nums) {
        int[] check = new int[nums.length+1];
        for(int i= 0;i<nums.length;i++){
            check[nums[i]]++;
        }
        List l = new ArrayList<Integer>();
        for(int i = 0; i < check.length; i++){
            if(check[i]==2){
                l.add(i);
            }
        }
        return l;
    }
}

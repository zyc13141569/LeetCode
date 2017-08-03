import java.util.ArrayList;
import java.util.List;

/**
 * Created by MH on 8/3/2017.
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

 Find all the elements of [1, n] inclusive that do not appear in this array.

 Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

 Example:

 Input:
 [4,3,2,7,8,2,3,1]

 Output:
 [5,6]

 */
public class Find_All_Numbers_Disappeared_in_an_Array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean c = false;
        int[] check = new int[nums.length+1];
        for(int i =0; i < nums.length; i++){
            if(nums[i]==0){
                c = true;
            }
            check[nums[i]]++;
        }
        List l = new ArrayList<Integer>();
        for(int i = 0; i < check.length;i++){
            if(check[i]==0){
                l.add(i);
            }
        }
        if(c==false){
            l.remove(0);
        }
        return l;
    }
}

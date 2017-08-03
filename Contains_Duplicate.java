import java.util.Map;
import java.util.TreeMap;

/**
 * Created by MH on 8/3/2017.
 * Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Map m = new TreeMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(m.containsKey(nums[i])){
                return true;
            } else {
                m.put(nums[i], 0);
            }
        }
        return false;
    }
}

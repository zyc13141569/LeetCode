/**
 * Created by MH on 8/3/2017.
 * Implement strStr().

 Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class strStr {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < 0 || haystack==null){
            return -1;
        } else {
            int index = -1;
            if(haystack.contains(needle)){
                index = haystack.indexOf(needle);
            }
            return index;
        }

    }
}

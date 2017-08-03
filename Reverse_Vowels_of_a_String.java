/**
 * Created by MH on 8/3/2017.
 * Write a function that takes a string as input and reverse only the vowels of a string.

 Example 1:
 Given s = "hello", return "holle".

 Example 2:
 Given s = "leetcode", return "leotcede".

 Note:
 The vowels does not include the letter "y".
 */
public class Reverse_Vowels_of_a_String {
    public String reverseVowels(String s) {
        if(s.length() <=1){
            return s;
        }
        char[] result = s.toCharArray();
        String vow = "aeiouAEIOU";

        int i = 0, j = s.length()-1;
        while(i < j){
            while(i < j && !vow.contains(result[i]+"")) i++;
            while(i<j && !vow.contains(result[j]+"")) j--;

            char tmp = result[i];
            result[i] = result[j];
            result[j] = tmp;
            i++;j--;
        }
        return new String(result);
    }
}

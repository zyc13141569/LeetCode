/**
 * Created by MH on 8/3/2017.
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 Example 1:
 Input: "Let's take LeetCode contest"
 Output: "s'teL ekat edoCteeL tsetnoc"
 */
public class Reverse_Words_in_a_String_III {
    public String reverseWord(String s) {
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            output = c + output;
        }
        return output;
    }

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String output = "";
        for (String word : words) {
            output = output + reverseWord(word) + " ";
        }
        return output.substring(0, output.length()-1);
    }
}

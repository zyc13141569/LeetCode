/**
 * Created by MH on 8/3/2017.
 * Given a word, you need to judge whether the usage of capitals in it is right or not.

 We define the usage of capitals in a word to be right when one of the following cases holds:

 All letters in this word are capitals, like "USA".
 All letters in this word are not capitals, like "leetcode".
 Only the first letter in this word is capital if it has more than one letter, like "Google".
 Otherwise, we define that this word doesn't use capitals in a right way.

 Example 1:
 Input: "USA"
 Output: True

 Example 2:
 Input: "FlaG"
 Output: False
 */
public class Detect_Capital {
    //65  A         97  a
    //90  Z        122  z
    public boolean detectCapitalUse(String word) {
        if(word.length() == 1) return true;
        if(word.charAt(0) >= 65 && word.charAt(0) <= 90){
            if(word.charAt(1) >= 65 && word.charAt(1) <= 90){//case 1, all cap
                for(int i = 2; i < word.length(); i++){
                    if(word.charAt(i) > 90 || word.charAt(i) < 65) return false;
                }
            } else {
                for(int i = 2; i < word.length(); i++){
                    if(word.charAt(i) > 122 || word.charAt(i) < 97) return false;
                }
            }
        }
        if(word.charAt(0) >= 97 && word.charAt(0) <= 122){
            for(int i = 1; i < word.length(); i++){
                if(word.charAt(i) > 122 || word.charAt(i) <97) return false;
            }
        }
        return true;
    }
}

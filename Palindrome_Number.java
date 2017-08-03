/**
 * Created by MH on 8/3/2017.
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        String tmp = x + "";
        for(int i = 0; i < tmp.length() / 2; i++){
            if(tmp.charAt(i) != tmp.charAt(tmp.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}

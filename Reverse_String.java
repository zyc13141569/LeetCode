/**
 * Created by MH on 8/3/2017.
 * Write a function that takes a string as input and returns the string reversed.

 Example:
 Given s = "hello", return "olleh".


 */
public class Reverse_String {
    public String reverseString(String s) {
        char[] ch = s.toCharArray();
        int mp = s.length() / 2;
        for(int i = 0; i < mp; i++){
            char tmp = ch[s.length() - 1 - i];
            ch[s.length() - 1 - i] = ch[i];
            ch[i] = tmp;
        }
        return new String(ch);
    }
}

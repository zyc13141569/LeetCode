/**
 * Created by MH on 8/3/2017.
 * Validate if a given string is numeric.
     Some examples:
     "0" => true
     " 0.1 " => true
     "abc" => false
     "1 a" => false
     "2e10" => true
 */
public class Vaild_Number {
    public boolean isNumber(String s) {
        s = s.toLowerCase();
        if(s.subSequence(s.length() - 1, s.length()).equals("d") ||
                s.subSequence(s.length() - 1, s.length()).equals("f")){
            return false;
        } else {
            try{
                Double.parseDouble(s);
                return true;
            } catch(Exception e) {
                return false;
            }
        }
    }
}


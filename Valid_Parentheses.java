import java.util.Stack;

/**
 * Created by MH on 8/3/2017.
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class Valid_Parentheses {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        if(s.length() < 2){
            return false;
        }
        for(int i = 0; i<s.length(); i++){
            if((stack.empty() == true) && (s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']')) return false;
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            } else {
                if(!stack.empty()){
                    if(s.charAt(i)==')'){
                        if((char)stack.peek()!='(') return false;
                        else stack.pop();
                    }
                    if(s.charAt(i)==']'){
                        if((char)stack.peek()!='[') return false;
                        else stack.pop();
                    }
                    if(s.charAt(i)=='}'){
                        if((char)stack.peek()!='{') return false;
                        else stack.pop();
                    }
                }
            }
        }
        if(!stack.empty()){
            return false;
        }
        return true;
    }
}

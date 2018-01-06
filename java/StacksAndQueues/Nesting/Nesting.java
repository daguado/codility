import java.util.Stack;
import java.lang.Character;

class Solution {
    public int solution(String S) {
        
        Stack<Character> openParenthesis = new Stack<Character>();
        
        for (int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            if (c == '('){
                openParenthesis.push(c);
            } else {
                if (openParenthesis.isEmpty()){
                    return 0;
                } else {
                    char topElement = openParenthesis.pop();
                    
                    if ((c == ')' && topElement != '(')){
                        return 0;
                    }
                }
            }
        }

        return (openParenthesis.isEmpty() ? 1 : 0);
    }
}

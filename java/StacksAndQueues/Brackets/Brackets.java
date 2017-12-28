import java.util.Stack;
import java.lang.Character;

class Solution {
    public int solution(String S) {
        
        Stack<Character> openBrackets = new Stack<Character>();
        
        for (int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            if (c == '{' || c == '[' || c == '('){
                openBrackets.push(c);
            } else {
                if (openBrackets.isEmpty()){
                    return 0;
                } else {
                    char topBracket = openBrackets.pop();
                    
                    if ((c == '}' && topBracket != '{') 
			|| (c == ']' && topBracket != '[') 
			|| (c == ')' && topBracket != '(')){
                        return 0;
                    }
                }
            }
        }

        return (openBrackets.isEmpty() ? 1 : 0);
    }
}
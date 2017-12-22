import java.util.*;

class Solution {
    public int solution(int X, int[] A) {
        
        Set<Integer> elems = new HashSet<Integer>();
        
        for (int j = 1; j <= X; j++){
            elems.add(j);
        }
        
        for (int i = 0; i < A.length; i++) {
            elems.remove(A[i]);
            if (elems.isEmpty()){
                return i;    
            }
        }
        return -1;
    }
}

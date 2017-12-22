import java.util.stream.*;
import java.util.*;

class Solution {
    public int solution(int X, int[] A) {
        
        Set<Integer> elems = IntStream.rangeClosed(1, X).boxed().collect(Collectors.toSet());
        
        for (int i = 0; i < A.length; i++) {
            elems.remove(A[i]);
            if (elems.isEmpty()){
                return i;    
            }
        }
        return -1;
    }
}

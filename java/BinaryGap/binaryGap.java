
class Solution {
    public int solution(int N) {
        String binaryRepresentation = getBinaryRepresentation(N);
        int longestGap = 0;
        int currentGap = 0;
        for(int i=0;i<binaryRepresentation.length();i++){
             if (binaryRepresentation.charAt(i) == '1') {
                if (currentGap > longestGap) {
                    longestGap = currentGap;
                }
                currentGap = 0;
            } else if (binaryRepresentation.charAt(i) == '0') {
                currentGap++;    
            }
        }

        return longestGap;
        
    }
    
    public String getBinaryRepresentation(int N) {
        return Integer.toBinaryString(N);    
    }
}
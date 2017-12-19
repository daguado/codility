import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int solution(int N) {
        String binaryRepresentation = getBinaryRepresentation(N);

        String regex = "((?<=1)0+(?=1))";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(binaryRepresentation);

        int longestGap = 0;
        while(matcher.find()) {
            int currentGap = matcher.group().length();
            
            if (currentGap > longestGap) {
                longestGap = currentGap;
            }
        }

        return longestGap;        
    }
    
    public String getBinaryRepresentation(int N) {
        return Integer.toBinaryString(N);    
    }

}

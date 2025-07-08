import java.util.*;

class Solution {
    public String solution(String my_string) {        
        char[] chars = my_string.toLowerCase().toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder();
        
        for (char ch : chars) {
            String str = String.valueOf(ch);
            sb.append(str);
        }
        
        return sb.toString();
    }
}
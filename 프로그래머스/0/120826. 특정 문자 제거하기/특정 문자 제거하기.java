class Solution {
    public String solution(String my_string, String letter) {
        char[] chars = my_string.toCharArray();
        char[] letterChars = letter.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < chars.length; i++) {
            if (letterChars[0] == chars[i]) {
                continue;
            }
            
            sb.append(chars[i]);
        }
        
        return sb.toString();
    }
}
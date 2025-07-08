class Solution {
    public String solution(String my_string) {
        char[] chars = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (char ch : chars) {
            int ascii = (int) ch;
            if (ascii >= 97) {
                sb.append(String.valueOf(ch).toUpperCase());
                continue;
            }
            
            sb.append(String.valueOf(ch).toLowerCase());
        }
        
        return sb.toString();
    }
}
class Solution {
    public String solution(String my_string, int n) {
        char[] chars = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (char ch : chars) {
            for (int i = 0; i < n; i++) {
                sb.append(String.valueOf(ch));
            }
        }
        
        return sb.toString();
    }
}
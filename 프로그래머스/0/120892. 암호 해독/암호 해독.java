class Solution {
    public String solution(String cipher, int code) {
        int count = cipher.length() / code;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= count; i++) {
            sb.append(cipher.charAt((i * code) - 1));
        }
        
        return sb.toString();
    }
}
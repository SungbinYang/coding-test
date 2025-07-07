class Solution {
    public int solution(String message) {
        char[] chars = message.toCharArray();
        int length = 0;
        
        for (char ch : chars) {
            length++;
        }
        
        return length * 2;
    }
}
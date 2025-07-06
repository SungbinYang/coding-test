class Solution {
    public int solution(int n, int k) {
        if (n < 0 && n > 1000) {
            
        }
        
        if (k < (n / 10) && k > 1000) {
            throw new IllegalArgumentException();
        }
        
        return n * 12000 + k * 2000 - (n / 10) * 2000;
    }
}
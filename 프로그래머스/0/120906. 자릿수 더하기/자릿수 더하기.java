class Solution {
    public int solution(int n) {
        int length = String.valueOf(n).length();
        int number = 0;
        int result = 0;
        
        for (int i = length - 1; i >= 0; i--) {
            number = n / (int) (Math.pow(10.0, (double) (i)));
            n = n % (int) (Math.pow(10.0, (double) (i)));
            result += number;
        }
        
        return result;
    }
}
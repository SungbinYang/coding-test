class Solution {
    public double solution(int[] numbers) {
        double result = 0.0;
        
        for (int number : numbers) {
            result += number;
        }
        
        return result / numbers.length;
    }
}
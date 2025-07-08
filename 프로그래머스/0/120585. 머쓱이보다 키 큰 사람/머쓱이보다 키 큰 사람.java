class Solution {
    public int solution(int[] array, int height) {
        int result = 0;
        
        for (int number : array) {
            if (number > height) {
                result++;
            }
        }
        
        return result;
    }
}
class Solution {
    public int[] solution(int[] num_list) {
        int[] results = {0, 0};
        
        for (int number : num_list) {
            if (number % 2 == 0) {
                results[0] += 1;
            } else {
                results[1] += 1;
            }
        }
        
        return results;
    }
}
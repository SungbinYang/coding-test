import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int length = num_list.length;
        int result = 1;
        
        if (length >= 11) {
            result = Arrays.stream(num_list)
                .map(i -> i)
                .sum();
        } else {
            for (int i : num_list) {
                result *= i;
            }
        }
        
        return result;
    }
}
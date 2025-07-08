import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> numbers = new ArrayList<>();
        
        for (int num : numlist) {
            if (num % n == 0) {
                numbers.add(num);
            }
        }
        
        return numbers.stream()
            .mapToInt(i -> i)
            .toArray();
    }
}
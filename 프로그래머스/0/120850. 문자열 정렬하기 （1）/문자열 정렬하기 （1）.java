import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        char[] chars = my_string.toCharArray();
        List<Integer> numbers = new ArrayList<>();
        
        for (char ch : chars) {
            String str = String.valueOf(ch);
            if (str.matches("[0-9]+")) {
                numbers.add(Integer.valueOf(str));
            }
        }
        
        Collections.sort(numbers);
        
        return numbers.stream()
            .mapToInt(i -> i)
            .toArray();
    }
}
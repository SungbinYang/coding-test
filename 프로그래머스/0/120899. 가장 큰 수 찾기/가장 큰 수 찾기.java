import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] results = new int[2];
        int findNumber = Arrays.stream(array)
            .max()
            .getAsInt();
        
        for (int i = 0; i < array.length; i++) {
            if (findNumber == array[i]) {
                results[0] = findNumber;
                results[1] = i;
            }
        }
        
        return results;
    }
}
import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> strings = new ArrayList<>();
        
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                strings.add(todo_list[i]);
            }
        }
        
        return strings.toArray(new String[strings.size()]);
    }
}
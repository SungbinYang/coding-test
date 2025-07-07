class Solution {
    public String solution(String my_string) {
        String[] strArr = {"a", "e", "i", "o", "u"};
        String result = my_string;
        
        for (String s : strArr) {
            if (result.contains(s)) {
                result = result.replace(s, "");
            }
        }
        
        return result;
    }
}
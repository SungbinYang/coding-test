class Solution {
    public int solution(int age) {
        if (age < 0 && age > 120) {
            throw new IllegalArgumentException();
        }
        
        return 2022 - age + 1;
    }
}
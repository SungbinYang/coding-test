class Solution {
    public int solution(int num1, int num2) {
        if ((num1 < 0 && num1 > 100) || (num2 < 0 && num2 > 100)) {
            throw new IllegalArgumentException();
        }
        
        double modNumber = (double) num1 / num2;
        return (int) (modNumber * 1000);
    }
}
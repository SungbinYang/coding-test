class Solution {
    public int[] solution(int[] num_list) {
        int[] numbers = new int[num_list.length];
        
        for (int i = num_list.length - 1; i >= 0; i--) {
            numbers[numbers.length - 1 - i] = num_list[i];
        }
        
        return numbers;
    }
}
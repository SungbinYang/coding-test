class Solution {
    public int[] solution(int money) {
        int coffeePrice = 5500;
        int[] results = new int[2];
        
        results[0] = money / coffeePrice;
        results[1] = money % coffeePrice;
        
        return results;
    }
}
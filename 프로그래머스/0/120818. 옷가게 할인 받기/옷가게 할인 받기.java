class Solution {
    public int solution(int price) {
        if (price % 10 == 0) {
            return discount(price);
        }
        
        return price;
    }
    
    private int discount(int price) {
        if (price >= 500000) {
            return (int) ((double) price - price * 0.2);
        }
        
        if (price >= 300000) {
            return (int) ((double) price - price * 0.1);
        }
        
        if (price >= 100000) {
            return (int) ((double) price - price * 0.05);
        }
        
        return price;
    }
}
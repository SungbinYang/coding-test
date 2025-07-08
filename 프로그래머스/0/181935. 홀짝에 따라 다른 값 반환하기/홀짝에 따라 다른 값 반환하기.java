import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        if (isOdd(n)) {
            return IntStream.rangeClosed(1, n)
                .filter(i -> i % 2 == 1)
                .map(i -> i)
                .sum();
        }
        
        return IntStream.rangeClosed(1, n)
            .filter(i -> i % 2 == 0)
            .map(i -> pow(i))
            .map(i -> (int) i)
            .sum();
    }
    
    private int pow(double n) {
        return (int) Math.pow((double) n, 2.0);
    }
    
    private boolean isOdd(int n) {
        return n % 2 == 1;
    }
}
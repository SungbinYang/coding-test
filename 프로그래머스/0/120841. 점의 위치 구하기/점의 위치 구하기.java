class Solution {
    public int solution(int[] dot) {
        if (dot[0] > 0 && dot[1] > 0) {
            return Quadrants.ONE.getQuadrant();
        }
        
        if (dot[0] < 0 && dot[1] > 0) {
            return Quadrants.TWO.getQuadrant();
        }
        
        if (dot[0] < 0 && dot[1] < 0) {
            return Quadrants.THREE.getQuadrant();
        }
        
        if (dot[0] > 0 && dot[1] < 0) {
            return Quadrants.FOUR.getQuadrant();
        }
        
        return 0;
    }
    
    enum Quadrants {
        ONE(1),
        TWO(2),
        THREE(3),
        FOUR(4);
        
        private final int quadrant;
        
        Quadrants(int quadrant) {
            this.quadrant = quadrant;
        }
        
        public int getQuadrant() {
            return quadrant;
        }
    }
}
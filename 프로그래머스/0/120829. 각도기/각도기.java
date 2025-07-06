class Solution {
    public int solution(int angle) {
        if (0 < angle && angle < 90) {
            return Angle.ACTUTE_ANGLE.getValue();
        }
        
        if (angle == 90) {
            return Angle.RIGHT_ANGLE.getValue();
        }
        
        if (90 < angle && angle < 180) {
            return Angle.OBTUSE_ANGLE.getValue();
        }
        
        if (angle == 180) {
            return Angle.SQUARE.getValue();
        }
        
        throw new IllegalArgumentException();
    }
    
    enum Angle {
        ACTUTE_ANGLE("예각", 1),
        RIGHT_ANGLE("직각", 2),
        OBTUSE_ANGLE("둔각", 3),
        SQUARE("평각", 4);
        
        private final String name;
        
        private final int value;
        
        Angle(String name, int value) {
            this.name = name;
            this.value = value;
        }
        
        public String getName() {
            return name;
        }
        
        public int getValue() {
            return value;
        }
    }
}
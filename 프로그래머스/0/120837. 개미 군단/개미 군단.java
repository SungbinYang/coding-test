class Solution {
    public int solution(int hp) {
        int jang = hp / 5;
        int bung = hp % 5 / 3;
        int il = hp % 5 % 3 / 1;
        
        return jang + bung + il;
    }
}
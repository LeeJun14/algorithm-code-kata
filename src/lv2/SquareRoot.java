package lv2;

public class SquareRoot {
    public long solution(long n) {
        long answer = 0;
        long x = (long) Math.pow((long) Math.sqrt(n), 2);
        if(x == n) {
            answer = (long) Math.pow(Math.sqrt(n)+1, 2);
        }
        if(x != n || 1 > Math.sqrt(n)) {
            answer = -1;
        }
        return answer;
    }
}

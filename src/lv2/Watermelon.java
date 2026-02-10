package lv2;

public class Watermelon {
    public String solution(int n) {
        String answer = "";
        char su = '수';
        char back = '박';

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += back;
            } else  {
                answer += su;
            }
        }
        return answer;
    }
}

package lv2;

public class ArrReverse {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        for(int i = 1; i <= str.length(); i++) {
            answer[i-1] = str.charAt(str.length() - i) - '0';
        }
        return answer;
    }
}

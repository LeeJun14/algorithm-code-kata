package lv2;

public class AddMissingNum {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int n : numbers) {
            answer -= n;
        }
        return answer;
    }
}

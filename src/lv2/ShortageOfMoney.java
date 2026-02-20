package lv2;

public class ShortageOfMoney {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long result = 0;

        for (int i = 1; i <= count; i++) {
            result += (i * price);
        }
        if(result > money) {
            answer = Math.abs(result - money);
        }

        return answer;
    }
}

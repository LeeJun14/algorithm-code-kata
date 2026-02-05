package lv2;

public class Masking {
    public String solution(String phone_number) {
        String answer = phone_number.replaceAll(".(?=.{4})", "*");
        return answer;
    }
}

package lv2;

public class OnlyNum {
    public boolean solution(String s) {
        boolean answer = true;

        if(!s.matches("^[0-9]+$")) {
            answer = false;
        }

        if(s.length() != 4 && s.length() != 6) {
            answer = false;
        }

        return answer;
    }
}

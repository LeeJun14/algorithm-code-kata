package lv2;

public class Harshad {
    public boolean solution(int x) {

        boolean answer = true;
        int y = 0;
        String str = String.valueOf(x);

        for (int i = 0; i < str.length(); i++) {
            y += Integer.parseInt(str.charAt(i) + "");
        }
        if(x % y != 0) {
            answer = false;
        }
        return answer;
    }
}

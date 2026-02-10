package lv2;

public class Median {
    public String solution(String s) {
        String answer = "";

        int mid = s.length() / 2;
        char c = s.charAt(mid);

        if(s.length()%2==0){
            answer = s.substring(mid - 1, mid + 1);
        } else {
            answer = String.valueOf(c);
        }
        return answer;
    }
}

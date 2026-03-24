package lv3;

public class CaesarCipher {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(c == ' ') {
                answer.append(c);
            } else {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                answer.append((char) ((c - base + n) % 26 + base));
            }
        }

        return answer.toString();
    }
}

package lv2;
import java.util.*;

public class FindKim {
    public String solution(String[] seoul) {
        int i = Arrays.asList(seoul).indexOf("Kim");
        String answer = "김서방은 " + i + "에 있다";
        return answer;
    }
}

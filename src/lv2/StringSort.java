package lv2;

import java.util.Arrays;
import java.util.Collections;

public class StringSort {
    public String solution(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder answer = new StringBuilder();
        Arrays.stream(arr).forEach(answer::append);
        return answer.toString();
    }
}

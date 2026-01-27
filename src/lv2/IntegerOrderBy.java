package lv2;

import java.util.Arrays;
import java.util.Collections;

public class IntegerOrderBy {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        String[] arr =  str.split("");
        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}

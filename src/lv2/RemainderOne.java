package lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemainderOne {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {
            if(n % i == 1) {
                list.add(i);
            }
        }
        answer = Collections.min(list);
        return answer;
    }
}

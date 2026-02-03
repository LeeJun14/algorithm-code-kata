package lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivNumArr {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }

        if(list.size() != 0) {
            answer = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            Arrays.sort(answer);
        }
        return answer;
    }
}

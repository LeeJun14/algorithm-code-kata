package lv3;

import java.util.*;

public class PlusTwoNum {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        int[] answer = new int[list.size()];

        for (int k = 0; k < list.size(); k++) {
            answer[k] = list.get(k);
        }

        return answer;
    }
}

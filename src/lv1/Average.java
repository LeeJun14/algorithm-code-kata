package lv1;

public class Average {
    public double solution(int[] numbers) {
        double answer = 0;
        double average = 0;
        for(int i = 0; i <= numbers.length-1; i++) {
            answer += numbers[i];
        }
        average = (answer / numbers.length);
        return average;
    }
}

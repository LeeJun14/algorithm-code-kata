package lv2;

public class Average {
    public double solution(int[] arr) {
        double answer = 0;
        double average = 0;
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        average = (answer / arr.length);
        return average;
    }
}

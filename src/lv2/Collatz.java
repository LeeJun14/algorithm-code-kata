package lv2;

public class Collatz {
    public int solution(int num) {
        long answer = num;
        long count = 0;

        while(true){
            if(answer == 1) {
                break;
            }
            if(count >= 500) {
                count = -1;
                break;
            }
            if(answer % 2 == 0){
                answer = (answer/2);
            } else {
                answer = ((answer*3)+1);
            }
            count++;
        }
        return (int) count;
    }
}

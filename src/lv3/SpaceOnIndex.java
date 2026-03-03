package lv3;

public class SpaceOnIndex {
    public static void main(String[] args) {
        String s = "try hello world";
        s = s.toLowerCase();
        StringBuilder answer = new StringBuilder();
        int idx = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                answer.append(' ');
                idx = 0;
            } else {
                if(idx == 0 || idx % 2 == 0) {
                    answer.append(Character.toUpperCase(s.charAt(i)));
                } else {
                    answer.append(s.charAt(i));
                }
                idx++;
            }
        }
        System.out.println(answer);
    }
}

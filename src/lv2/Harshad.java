package lv2;

public class Harshad {
    public static boolean main(String[] args) {
        boolean answer = true;
        int x = 12;
        int y = 0;
        String str = String.valueOf(x);

        for (int i = 0; i < str.length(); i++) {
            y += Integer.parseInt(str.charAt(i) + "");
        }
        if(x % y != 0) {
            answer = false;
        }
        return answer;
    }
}

package lv2;

public class Ternary {
    public static void main(String[] args) {
        int n = 45;
        int answer = 0;
        String base3 = Integer.toString(n, 3);
        String reversed = new StringBuilder(base3).reverse().toString();
        answer = Integer.parseInt(reversed, 3);
    }
}

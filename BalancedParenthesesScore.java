public class BalancedParenthesesScore {
    public static void main(String[] args) {

        String s = "(()())";
        int depth = 0;
        int score = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                depth++;
            } else {
                score += 2 * depth;
                depth--;
            }
        }

        System.out.println(score);
    }
}

public class Generate Paranthesis
{

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(ans, new StringBuilder(), 0, 0, n);
        // System.out.println(ans);
        return ans;
    }

    public static void generate(List<String> ans, StringBuilder current, int open, int close, int max) {
        if (current.length() == max * 2) {
            ans.add(current.toString());
            return;
        }

        if (open < max) {
            current.append("(");
            generate(ans, current, open + 1, close, max);
            current.deleteCharAt(current.length() - 1);
        }

        if (close < open) {
            current.append(")");
            generate(ans, current, open, close + 1, max);
            current.deleteCharAt(current.length() - 1);
        }
    }
}

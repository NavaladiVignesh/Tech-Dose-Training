package Array;

public class First_One {
    public static void main(String[] args) {
        String s = "00111111"; // 7
        System.out.println(FirstOne(s, 0, s.length() - 1));
    }

    static int FirstOne(String s, int low, int high) {
        if (lo > hi)
            return low;
        int mid = low + (high - low) / 2;
        if (s.charAt(mid) == '1') {
            return FirstOne(s, low, mid - 1);
        } else {
            return FirstOne(s, mid + 1, high);
        }
    }
}

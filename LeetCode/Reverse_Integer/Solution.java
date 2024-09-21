package LeetCode.Reverse_Integer;

class Solution {
    public int reverse(int x) {
        boolean negative = x < 0;
        if (negative)
            x = -x;
        StringBuilder str = new StringBuilder(String.valueOf(x));
        str.reverse();

        try {
            int reversed = Integer.parseInt(str.toString());
            return negative ? -reversed : reversed;
        } catch (NumberFormatException e) {
            // Handle overflow by returning 0
            return 0;
        }
    }
}

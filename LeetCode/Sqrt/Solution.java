// package LeetCode.Sqrt;

class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        // Binary Search boundaries
        int left = 1, right = x, result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid squared is less than or equal to x
            if (mid <= x / mid) { // To avoid overflow, use x / mid instead of mid * mid
                result = mid; // Mid is a potential answer
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return result;
    }
}
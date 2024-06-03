// package LeetCode.Palindrom;

/**
 * main
 */
public class main {
    public boolean isPalindrome(int x) {
        int rev = 0, n = x;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev == n ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(new main().isPalindrome(121));
    }
}
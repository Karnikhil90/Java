package Pattern;

public class Diamond {
    public static void main(String[] args) {
        int n = 4;
        // normal star
        for (int i = 1; i <= n; i++) {
            for (int blank = 1; blank <= n - i; blank++) {
                System.out.print("  ");
            }
            // Star's '*'
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("* ");
            }
            for (int stars1 = 1; stars1 < i; stars1++) {
                System.out.print("* ");
            }

            System.out.println();

        }
        // FlipStatr
        for (int i = 2; i <= n; i++) {
            for (int blank = 1; blank < i; blank++) {
                System.out.print("  ");
            }
            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print("* ");
            }
            for (int j = n - i + 1; j > 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
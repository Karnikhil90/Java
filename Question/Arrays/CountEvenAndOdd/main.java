package Question.Arrays.CountEvenAndOdd;

public class main {
    public static int count(int[] array, String evenOrOdd) {
        int count = 0;
        if (evenOrOdd.equalsIgnoreCase("e")
                || evenOrOdd.equalsIgnoreCase("even")) {
            for (int element : array) {
                if (element % 2 == 0)
                    count++;
            }
        } else if (evenOrOdd.equalsIgnoreCase("o")
                || evenOrOdd.equalsIgnoreCase("odd")) {
            for (int element : array) {
                if (element % 2 == 1)
                    count++;
            }
        } else {
            System.out.println("ErrorType : input invalid ");
            count = -1;
        }
        return count;
    }

    public static int count(int[] array) {
        return count(array, "e");
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 9, 99, 53, 11, 89 };
        int res = count(arr, "o");
        System.out.println(res);
    }
}

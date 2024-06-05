package Question.Arrays.isIncreasing;

public class main {
    public static boolean isIncreasing(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 77, 66, 99, 88, 77, 88, 76, 66, 2, 52 };
        int[] inc = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        System.out.println(isIncreasing(arr)); // false
        System.out.println(isIncreasing(inc)); // true
    }
}

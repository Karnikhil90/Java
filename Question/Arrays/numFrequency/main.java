package Question.Arrays.numFrequency;

/**
 * main
 */
public class main {

    public static int frequency(int[] array, int element) {
        int count = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element)
                count++;
        }

        return count;
    }

    public static void frequency(int[] array) {
        for (int element : array) {
            int frq = frequency(array, element);
            if (frq != 0)
                System.out.println(element + "\t" + frq);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 77, 66, 99, 88, 77, 88, 76, 66, 2, 52 };
        frequency(arr);
    }
}
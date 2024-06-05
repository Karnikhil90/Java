package Question.Arrays.Dublicate;

public class main {
    public static void dublicate(int[] array) {
        // int count = 0;
        for (int i = 0; i < array.length; i++) {
            int count = -1;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j])
                    count++;
            }
            if (count != -1 && count > 0) {
                System.out.println(array[i] + "=" + count);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 9, 99, 53, 2, 99 };
        dublicate(arr);
    }
}

package Question.Arrays.Reverce;

public class main {

    public static int[] reverce(int[] array) {
        int[] reverced_array = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reverced_array[i] = array[array.length - 1 - i];
        }

        return reverced_array;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("len=" + arr.length);

        int[] res = reverce(arr);
        System.out.println("len=" + res.length);

        for (int i : res) {
            System.out.println(i);
        }
    }
}

package Question.Arrays.RemoveItem;

public class main {
    static int[] remove(int[] array, int removal_item) {
        int[] new_array = new int[array.length - 1];
        int i = 0;
        for (int element : array) {
            if (element != removal_item) {
                new_array[i] = element;
                i++;
            }
        }
        return i == 0 ? array : new_array;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("len=" + arr.length);

        int[] res = remove(arr, 2);
        System.out.println("len=" + res.length);
        for (int i : res) {
            System.out.println(i);
        }
    }
}

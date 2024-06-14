package Question.Arrays.Insert;

import lib.mylibs;

/**
 * Insert an element an a selected position
 */
public class main extends mylibs {

    public static int[] insert(int[] array, int element, int index) {
        if (index > array.length) {
            throw new IllegalArgumentException("ErrorType: Out of index");
        }
        int[] arr = new int[array.length + 1];
        int update = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                arr[i] = element;
            } else {
                arr[i] = array[update];
                update++;
            }
        }
        return arr;
    }

    public static int[] insert(int[] array, int element) {
        return insert(array, element, array.length); // SET : Default position at the last
    }

    public static void main(String[] args) {
        int[] array = range(1, 11);
        int[] res = insert(array, 99);
        print(res);
    }
}
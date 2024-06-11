package Question.Arrays.Rotation;

import lib.mylibs; // My own libaray to make my life easy

/*
 * @date 09-06-2024
 * Roatating an array 
 * From left to Right and then Right to left
 * 
 */
public class main extends mylibs {
    /* Left Roatation */
    public static int[] Rotation(int[] array) {
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        array[array.length - 1] = temp;
        return array;
    }

    /* Right Rotation */
    public static int[] Rotation1(int[] array) {
        int last = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;

        return array;
    }

    public static void main(String[] args) {

        System.out.println("original =>");
        print(range(1, 100));

        int[] right = Rotation1(range(1, 100));
        int[] left = Rotation(range(1, 100));

        print(right);
        print(left);
    }
}

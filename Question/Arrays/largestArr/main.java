package Question.Arrays.largestArr;

/*
 * largest number in array 
 */
public class main {

    public static int max(int[] array) {
        int temp = array[0], index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > temp) {
                temp = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 9, 7, 24, 8, 606, 45, 12, 2, 9, 7, 4, 5, 78 };
        int index = max(arr);
        System.out.println("element=" + arr[index] + " index=" + index);
    }
}
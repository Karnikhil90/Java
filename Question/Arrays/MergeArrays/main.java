/*
 *  create a function intput two array and return the merge of  both  array
 *  
 *  Example -> add(int[],int[]) 
 * 
 */

package Question.Arrays.MergeArrays;

public class main {
    public static int[] add(int[] array1, int[] array2) {
        int[] merged_array = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            merged_array[i] = array1[i];
        }
        for (int i = 0; i < array1.length; i++) {
            merged_array[i + array1.length] = array2[i];
        }
        return merged_array;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 6, 7, 8, 9, 10 };

        int[] res = add(arr1, arr2);
        for (int i : res) {
            System.out.println(i);
        }
    }
}

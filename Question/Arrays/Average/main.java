package Question.Arrays.Average;

/*
 *   Write a function called average(int[]) and return the average of all in double 
 */
public class main {
    public static int sum(int arr[]) {
        int result = 0;
        for (int i = 0; i < arr.length; i++)
            result += arr[i];
        return result;
    }

    public static double average(int[] array) {
        return sum(array) / array.length;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 12 };
        double res = average(arr);
        System.out.println(res);
    }
}
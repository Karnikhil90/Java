package Array.DualDimensionArray;

import java.util.Scanner;

public class Learning {
    public static void main(String[] args) {
        // int[][] array = new int[3][5];
        Scanner scan = new Scanner(System.in);

        int[][] array = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 10, 11, 12, 13, 14, }
        };

        int len = array.length;
        System.out.println("rows =" + len + " cols =" + len(array));
        print2d(array);
        System.out.println(array[2][1]);
        System.out.print("Enter the element in = ");
        searchIndex(array, scan.nextInt());
        scan.close();
    }

    static int len(int[][] arr) {
        int cols = arr[0].length;
        return cols;
    }

    static void print2d(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.print("}");
            System.out.println();
        }
    }

    static void searchIndex(int[][] arr, int seachingElement) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == seachingElement) {
                    System.out.printf("Index is {%d,%d}\n", i, j);
                }
            }
        }
    }

}

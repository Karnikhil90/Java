/*
@question 1 From hackerrank

	INPUT : 
		1 2 3 4 5
	OUTPUT :
		ANSWER = 15
		
	========================================	
	Baically take input as String and store split in array.
		Then sent to a user defined function called sun() & make a overloading function take INT[] AND STRING[]
		but return a INT.
*/
package Question;

import java.io.IOException;
import java.util.Scanner;

public class MultiSum {

	public static int sum(int arr[]) {
		int result = 0;
		for (int i = 0; i < arr.length; i++)
			result += arr[i];
		return result;
	}

	public static int sum(String[] arr) {
		int[] numbers = new int[arr.length];
		try {
			for (int i = 0; i < arr.length; i++)
				numbers[i] = Integer.parseInt(arr[i]);
		} catch (NumberFormatException e) {
			System.err.println("ErrorType: " + e.getMessage());

		}
		return sum(numbers);
	}

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		// int[] num = { 1, 2, 3, 4, 5 }; // Ans should be 15
		System.out.print("Enter the numbers :");
		String[] user_input = scan.nextLine().trim().split(" ");
		scan.close();
		System.out.println(sum(user_input));
	}
}

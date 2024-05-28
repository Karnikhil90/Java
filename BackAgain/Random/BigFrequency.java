package Random;

// Cheaking the frequency of a line 
// 1.the space will be not counted 
// 2. The capital,small letters will be calculated 
// 3.The number also calculated
// 4.the special also calculated
// ----------------START----------------
import java.util.Scanner;

public class BigFrequency {

    Scanner input;
    short spaces, capital, small, number, special;

    // Constructor to initialize the Scanner object
    public BigFrequency() {
        input = new Scanner(System.in);
    }

    // Method to get the input line from the user
    public String InputLine() {
        System.out.println("Enter the line: ");
        return input.nextLine();
    }

    // Method to process the input line and count the frequency of different
    // character types
    public void Process(String line) {
        int lengthOfLine = line.length();

        // Iterate through each character in the line
        for (int alpha = 0; alpha < lengthOfLine; alpha++) { // Corrected loop condition
            char ch = line.charAt(alpha);

            // Check if the character is a capital letter
            if (Character.isUpperCase(ch)) {
                capital++;
            }

            // Check if the character is a small letter
            else if (Character.isLowerCase(ch)) {
                small++;
            }

            // Check if the character is a whitespace character (space)
            else if (Character.isWhitespace(ch)) {
                spaces++;
            }

            // Check if the character is a numeric character (number)
            else if (Character.isDigit(ch)) {
                number++;
            }

            // Count any other character as a special character
            else {
                special++;
            }
        }
        System.out.println("Capital letters: " + capital);
        System.out.println("Small letters: " + small);
        System.out.println("Special letters: " + special);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + number);
    }

    // Driver code
    public static void main(String[] args) {
        // Print the frequency of different character types
        BigFrequency myObj = new BigFrequency(); // Create an instance of the BigFrequency class
        myObj.Process(myObj.InputLine()); // Process the input line

    }
}

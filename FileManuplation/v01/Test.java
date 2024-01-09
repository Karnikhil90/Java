package FileManuplation.v01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    final String pathname = "FileManuplation\\v01\\name.txt";

    public String[] Reading() {
        File Obj = new File(pathname);
        int numberOfLines = 0;

        try {
            Scanner myReader = new Scanner(Obj);
            while (myReader.hasNextLine()) {
                numberOfLines++;
                myReader.nextLine(); // Read and discard the line
            }

            myReader.close(); // Close the Scanner

        } catch (Exception e) {
            System.err.println("Error");
        }

        String[] flattenedArray = new String[numberOfLines];

        try {
            Scanner myReader = new Scanner(Obj);

            for (int i = 0; i < numberOfLines; i++) {
                flattenedArray[i] = myReader.nextLine().replaceAll("\\s+", " "); // Concatenate elements in the row
            }

            myReader.close(); // Close the Scanner

        } catch (Exception e) {
            System.err.println("File Not Found");
        }

        // Print the contents of the flattened array
        return flattenedArray;
    }

    public void addLineToFile(String line) {
        try {
            FileWriter writer = new FileWriter(pathname, true); // true for append mode
            writer.write(line + "\n"); // append the line to the file
            writer.close();
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        String[] list = test.Reading();

        String[] name = new String[list.length];
        String[] subject = new String[list.length];

        for (int i = 0; i < list.length; i++) {
            String[] a = list[i].split("\\$"); // Escape the dollar sign
            name[i] = a[0];
            subject[i] = a[1];
        }

        for (int i = 0; i < subject.length; i++) {
            System.out.println(subject[i]);
        }

        // Example of adding a new line to the file
        test.addLineToFile("Manoj Ram$Sports");
    }
}

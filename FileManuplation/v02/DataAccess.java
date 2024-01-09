import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * DataAccess
 */
public class DataAccess {
    String file_path;

    DataAccess(String file_path) {
        this.file_path = file_path;
    }

    String[] line;

    public String[] ReaderFile() {

        File file = new File(file_path);
        int numberOfLines = 0;
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                numberOfLines++;
                myReader.nextLine(); // Read and discard the line
            }
            myReader.close(); // Close the Scanner
        } catch (Exception e) {
            System.err.println("\t****Error Type : Some Problem To read it****");
        }

        String[] line = new String[numberOfLines];

        int i = 0;
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                line[i] = reader.nextLine();
                i++;
            }
            reader.close();

        } catch (FileNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        // ! for (String index : line)
        // ! System.out.println(index);
        return line;
    }

    public void WritterFile(String name, String password, int age) {

        try {
            FileWriter writter = new FileWriter(file_path, true);
            writter.write(name + "," + password + "," + age + "\r\n");
            writter.close();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        DataAccess myobj = new DataAccess("FileManuplation\\v02\\userdata.txt");
        String[] userdataRecived = myobj.ReaderFile();
        String[] name = new String[userdataRecived.length];
        String[] password = new String[userdataRecived.length];
        String[] age = new String[userdataRecived.length];

        // ? Split the data into 3 arrays

        for (int i = 0; i < userdataRecived.length; i++) {
            String[] extracted = userdataRecived[i].split("\\,");
            name[i] = extracted[0];
            password[i] = extracted[1];
            age[i] = extracted[2];
        }
        for (String string : age) {
            System.out.println(string);
        }
    }
}
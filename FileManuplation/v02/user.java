import java.util.Scanner;

/*
 * user: just tesing practically that Im able to do the things or not
 * loging user and add a new user id to it
 */
public class user {

    DataAccess myOBJ = new DataAccess("FileManuplation\\v02\\userdata.txt");

    String[] userdataRecived = myOBJ.ReaderFile();
    String[] name = new String[userdataRecived.length];
    String[] password = new String[userdataRecived.length];
    String[] age = new String[userdataRecived.length];
    Scanner in;
    // ? Split the data into 3 arrays

    user() {
        in = new Scanner(System.in);
        for (int i = 0; i < userdataRecived.length; i++) {
            String[] extracted = userdataRecived[i].split("\\,");
            name[i] = extracted[0];
            password[i] = extracted[1];
            age[i] = extracted[2];
        }
    }

    public void addeUser() {
        Scanner in = new Scanner(System.in);
        System.out.print("user ID: ");
        String name = in.nextLine();
        System.out.print("Password: ");
        String password = in.nextLine();
        System.out.print("Tell your age :");
        int age = in.nextInt();
        in.close();
        myOBJ.WritterFile(name, password, age);
    }

    public void Login() {
        System.out.print("user ID: ");
        String inputName = in.nextLine();
        int i;
        // boolean userExist = false;
        for (i = 0; i < name.length; i++) {
            if (inputName.equalsIgnoreCase(name[i])) {
                System.out.print("Password: ");
                String inputPassword = in.nextLine();
                in.close();
                if (inputPassword.equalsIgnoreCase(password[i])) {
                    System.out.println("Login Success");
                } else
                    System.out.println("Failed to login");
                i = -1;
                break;
            }
        }
        if (i != -1) {
            System.out.println("User Did Not Exist");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1. Login \n2. Create a new ID \nEnter Your Choice : ");
        if (in.nextLine().equalsIgnoreCase("2"))
            new user().addeUser();
        else
            new user().Login();
        in.close();

    }
}
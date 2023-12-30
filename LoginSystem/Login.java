package LoginSystem;

import java.util.Scanner;

public class Login {

    Scanner input;
    private String InputUsername;
    private String InputUserpassword;
    private String InputUserID;
    private String pass = "1";
    private String name = "1";

    public Login() {
        input = new Scanner(System.in);
    }

    private void Interfaces() {
        System.out.print("$:");
        String prompt = input.nextLine();

        // calling with user Choice
        if (prompt.equalsIgnoreCase("version") || prompt.equalsIgnoreCase("v")) {
            System.out.println("under Devlopment");
        } else {
            GetInput();
        }
    }

    private void GetInput() {
        System.out.println("Tell me your name :");
        String getName = input.nextLine();

        // if the name exists then ask for password or ask for creating a new one
        if (getName.equals(name)) {
            System.out.println("Password :");
            InputUserpassword = input.nextLine();
            if (InputUserpassword.equals(pass))
                System.out.println("Welcome ");

        } else {
            System.out.println("Want to create a new ?");
        }

    }

    public static void main(String[] args) {
        Login myObj = new Login();
        myObj.Interfaces();
    }
}
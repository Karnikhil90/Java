package lib;

import java.util.Scanner;

public class SysInput {

    SysInput() {
    }

    public static String input(String data) {
        Scanner scan = new Scanner(System.in);
        System.out.print(data);
        String user_input = scan.nextLine();
        scan.close();
        return user_input;
    }

}

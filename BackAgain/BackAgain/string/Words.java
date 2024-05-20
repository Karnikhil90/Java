package BackAgain.string;

import java.util.Scanner;

class Words {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a line : ");
        String str = scan.nextLine() + " ";
        scan.close();
        String r = ""; // Result
        int counter = 0;

        for (short i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '/')
                counter++;
        }

        String arr[] = new String[counter];
        counter = 0;
        for (short i = 0; i < str.length(); i++) {
            // System.out.println(str.charAt(i));
            if (str.charAt(i) != '/') {
                r += str.charAt(i);
            } else {
                // System.out.println(r);
                arr[counter] = r;
                r = "";
                counter++;
            }
        }
        // System.out.println(r);
        for (int i = 0; i < arr.length; i++)
            System.out.println("arr= " + arr[i]);
    }
}
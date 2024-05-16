package BackAgain;

/**
 * Title
 */
public class Title {

    public static void main(String[] args) {
        System.out.println(toTitle1("my name is nikhil karmakar"));
    }

    static String toTitle(String str) {
        str = str.trim();
        String newstr = "";
        str = " " + str;
        for (short i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                newstr += " " + Character.toUpperCase(str.charAt(i + 1));
                i++;
            } else
                newstr += Character.toString(str.charAt(i));
        }
        return newstr.trim();
    }

    static String toTitle1(String str) {
        return;
    }
}
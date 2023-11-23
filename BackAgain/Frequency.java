// Frequency counts the occurrences of each letter in a string.
import java.util.*;
public class Frequency {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the line : ");
    String line = in.nextLine();
    in.close();
    //loop through each character in the string
    for(char alpha ='a'; alpha <= 'z';alpha++){
    // Counter variable
    int count = 0;
    for (int i = 0; i < line.length(); i++){
    char word = line.charAt(i);
      if(word == alpha)
      count++;
      }
    if (count != 0)
        System.out.println(alpha+": "+count);   
    }
}
}
// Cheaking the frequency of a line 
// 1.the space will be not counted 
// 2. The capital,small letters will be calculated 
// 3.The number also calculated
// 4.the special also calculated
// ----------------START----------------
import java.util.Scanner;
public class BigFrequency{
  Scanner input;
  short spaces, capital, small, number, special;
  // Constructor 
  BigFrequency(){
    input = new Scanner(System.in);
  }
  // Get the word
  public String gettheword(){
    System.out.println("Enter the line");
    return input.nextLine();
  }
  public void Process(String line)
  {
    short lengthOfLine = line.length();
      for(int alpha = 0; alpha <= lengthOfLine;alpha++)
      {
        char ch = line.charAt(alpha);
        
        if(Character.isUpperCase(ch))
        {
          capital++;
        }else if (Character.isLowerCase(ch))
        {
          small++;
        }else if(Character.isWhiteSpace(ch)){
          space++;

        }else if(Character.isDigit(ch))
        {  
          number++;
        }
        else{
            special++;
        }
      }
  }

  
  public static void main(String[] args){
    Frequency myObj = new Frequency();
    myObj.Process(myObj.gettheword());
  }
}
import java.util.*;
import java.io.*;
import java.math.*;

class Main 
{
  public static void main(String[] args)throws IOException
  {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter the type of pasword you would like to generate" + "\n Types of passwords include...");
    System.out.println("1 - Lowercase letters." + "\n2 - Uppercase letters," + "\n3 - Lowercase and uppercase letters." + "\n4 - Upper case, lowercase, and numbers." + "\n5 - Lowercase, uppercase, numbers, and symbols." + "\n0 - EXIT.");
    System.out.println("Enter selection by typing numbers 1, 2, 3, 4, 5, or 0 to exit.");
    
    
    System.out.println("Do you wish to continue? - Type 0 to exit or any other number to continue");   //Way to opt out.
    int optionX = scan.nextInt();
    if (optionX == 0)
    {                                             //Uncomment after program runs correctly.
      System.out.println("Exiting program...");
      System.exit(0);   //This method exits and ends the program.
    }    
   // int passwordType = scan.nextInt();
    
    int[] upperInts = new int[1000];    //These are the arrays that you need. 
    int[] lowerInts = new int[1000];    //Nums based on the position in the ASCII character list.
    int[] mixedcaseInts = new int[1000];
    int[] mixedcaseWnums = new int[1000];
    int[] allCharacters = new int[1000]; 

  
    File lowerCase = new File ("lower.txt");
    PrintWriter inputFile1 = new PrintWriter(lowerCase);
    int count1 = 1;
    while (count1 <= 1000)
    {
      inputFile1.print(count1);
      count1++;
    }
    inputFile1.close();

    File upperCase = new File("Upper.txt");
    PrintWriter inputFile2 = new PrintWriter(upperCase);
    int count2 = 1;
    while (count2 <= 1000)
    {
      inputFile2.print(count2);
      count2++;
    }
    inputFile2.close();

    File mixedLetters = new File("Mixed_letters.txt");
    PrintWriter inputFile3 = new PrintWriter(mixedLetters);
    int count3 = 1;
    while (count3 <= 1000)
    {
      inputFile3.print(count3);
      count3++;
    }
    inputFile3.close();

    File mixedLettersNumbers = new File("Mixed_Letters_Numbers.txt");
    PrintWriter inputFile4 = new PrintWriter(mixedLettersNumbers);
    int count4 = 1;
    while (count4 <= 1000)
    {
      inputFile4.print(count4);
      count4++;
    }
    inputFile4.close();

    File mixedChars = new File("Mixed_Chars");
    PrintWriter inputFile5 = new PrintWriter(mixedChars);
    int count5 = 1;
    while (count5 <= 1000);
    {
      inputFile5.print(count5);
      count5++;
    }
    inputFile5.close();


  }
} 
import java.util.*;

public class StringPalindrome
{
   public static void main(String args[])
   {
      String str;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a string:");
      str = sc.nextLine();
      boolean isPalindrome = true;
      for(int i = 0; i < str.length() / 2;i++)
      {
        if(str.charAt(i) != str.charAt(str.length() - 1 - i))
        {
          isPalindrome = false;
          break;
        }
      }
      if (isPalindrome)
      {
         System.out.println("Palindrome");
      }
      else
      {
         System.out.println("Not a Palindrome");
      }
   }
}
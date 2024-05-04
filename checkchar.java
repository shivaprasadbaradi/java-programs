import java.util.*;

public class checkchar
{
   public static void main(String args[])
   {
      char ch;
     
      Scanner sc = new Scanner(System.in);

      System.out.print("enter a letter : ");
      ch = sc.next().charAt(0);
  
      switch(ch) 
      {
        case 'A' :
        case 'E' :
        case 'I' :
        case 'O' :
        case 'U' :
        case 'a' :
        case 'e' :
        case 'i' :
        case 'o' :
        case 'u' :
        System.out.print("it is a vowel");
        break;
        default :
        System.out.print("it is a consonant");
        break;
      }
   }
}
import java.util.*;

public class oddeven
{
   public static void main(String args[])
   {
      int num;

      Scanner sc = new Scanner(System.in);

      System.out.print("enter a number");
      num = sc.nextInt();

      if(num % 2 == 0)
      {
          System.out.print("it is an even number");
      }
      else
      {
          System.out.print("it is an odd number");
      }
   }
} 
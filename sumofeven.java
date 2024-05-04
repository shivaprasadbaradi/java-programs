import java.util.*;

public class sumofeven
{
   public static void main(String args[])
   {
      int min, max, sum = 0;

      Scanner sc = new Scanner(System.in);

      System.out.print("enter a number : ");
      min = sc.nextInt();

      System.out.print("enter another number : ");
      max = sc.nextInt();

      if(min > max)
      {
          System.out.print("first number should be less than second number");
      }
      else
      {
        for(int i = min; i <= max; i++)
        {
           if(i % 2 == 0)
           {
              sum = sum + i;
           }
        }
       System.out.print("sum of even numbers between " + min + " and " + max + " is : " + sum);
      }
   }
}
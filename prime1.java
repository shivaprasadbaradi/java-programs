import java.util.*;
public class prime1
{
  public static void main(String args[])
  {
     int a,b,min,max,count;
     Scanner sc = new Scanner(System.in);
     System.out.print("enter min, max values = ");
     min = sc.nextInt();
     max = sc.nextInt();
     for(int i = min;i<=max;i++)
     {
        count = 0;
        for(int j=1;j<=i;j++)
        if(i%j == 0)
        {
           count = count + 1;
        }
        if(count == 2)
        System.out.print(i + " ");
     }
  }
}
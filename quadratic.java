import java.util.*;
public class quadratic
{
   public static void main(String args[])
   {
      int a, b, c,d = 0;
      Scanner sc = new Scanner(System.in);
      System.out.print("enter value of a : ");
      a = sc.nextInt();
      System.out.print("enter value of b : ");
      b = sc.nextInt();
      System.out.print("enter value of c : ");
      c = sc.nextInt();
      double root1,root2;
      d=b*b - 4*a*c;
      System.out.print("value of d = " + d + "\n");
      if(d==0)
      {
        System.out.print("roots are real and equal\n");
        root1 = -b/2*a;
        root2 = -b/2*a;
        System.out.println(root1);
        System.out.println(root2);
      }
      else if(d>0)
      {
        System.out.print("roots are real and different\n");
        root1 = -b + Math.sqrt(d)/2*a;
        root2 = -b - Math.sqrt(d)/2*a;
        System.out.println(root1);
        System.out.println(root2);
      }
      else{
          System.out.print("roots are imaginary\n");
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
      }
   }
}
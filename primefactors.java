import java.util.*;
class primefactors
{
    public static void main(String args[])
    {
       int num,i,j,count = 0;
       Scanner sc = new Scanner(System.in);
       System.out.print("enter a number : ");
       num = sc.nextInt();   
       System.out.print("prime factors of given number " + num + " = ");
       for(i=1;i<=num;i++)
       {
         count = 0;
         if(num%i == 0)
         { 
            for(j=1;j<=i;j++)
            {
               if(i%j == 0)
               {
                count = count + 1;
               }
            }
         }
         if(count == 2)
         {
           System.out.print(i + " ");
         }
       }
    }
}
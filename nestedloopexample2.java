public class nestedloopexample2
{
   public static void main(String[] args)
   {
      char ch = 'A';

      for(int i=1;i<=5;i++)
      {
         for(int j=1;j<=5;j++) 
         {
            System.out.print(ch + "  ");
            ch++;
         }
         ch = 'A';
         System.out.println();
      }
   }
}
/* A  B  C  D  E
   A  B  C  D  E
   A  B  C  D  E
   A  B  C  D  E
   A  B  C  D  E*/
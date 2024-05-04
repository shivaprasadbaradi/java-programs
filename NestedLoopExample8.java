public class NestedLoopExample8
{
   public static void main(String[] args)
   {
      char ch = 'A';

      for(int i=1;i<=5;i++)
      {
         for(int j=i;j<=5;j++) 
         {
            System.out.print(ch + "  ");
            ch++;
         }
            ch = 'A';
            System.out.println();                                                        
      }
   }
}
/*
A  B  C  D  E
A  B  C  D
A  B  C
A  B
A
*/
public class NestedLoopExample6
{
   public static void main(String[] args)
   {
      char ch='A';
      for(int i=1;i<=5;i++)
      {
         for(int j=1;j<=i;j++) 
         {
            System.out.print(ch + "  ");
           ch++;
         }
            ch='A';
            System.out.println();                                                        
      }
   }
}
/*if youremove sop then o/p will be shown in 1 line 
  (A  A  B  A  B  C  A  B  C  D  A  B  C  D  E)
A
A  B
A  B  C
A  B  C  D
A  B  C  D  E
*/  
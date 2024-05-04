public class palindrome
{
   public static void main(String[] args)   
   {
      int num = 1231, temp = 0, rev = 0, remainder=0;
  
      temp = num;  

      while(temp != 0)
      {
         remainder = temp % 10;  
         rev = rev * 10 + remainder;  
         temp = temp / 10;  //temp = 21
      }
      if (num==rev)
      {
       System.out.println(num + " is palindrome");
      }else{ System.out.println(num + "is not palindrome");
       }
   }
}

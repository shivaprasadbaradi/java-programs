import java.util.*;
public class calc
{
   public static void main(String args[])
   {
     double a,b,sum,mul,div,mod,sub,result;
     Scanner sc = new Scanner(System.in);
     System.out.print("enter a,b values");
     a = sc.nextInt();
     b = sc.nextInt();
     System.out.print("choose operator + - * / %  :");
     char operator = sc.next().charAt(0);
     switch(operator)
     {
        case '+':
        result = a+b;
        System.out.print(result);
        break;
        case '-':
        result = a-b;
        System.out.print(result);   
        break;
        case '*':
        result = a*b;
        System.out.print(result);
        break;
        case '%':
        result = a%b;
        System.out.print(result);
        break;
        case '/':
        result = a/b;
        System.out.print(result);
        break;
        default :
        System.out.print("enter correct numbers");
     }
   }
}
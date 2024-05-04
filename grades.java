/*program-1: write a  java program to take 3 subjects marks, find total, average 
           and result using if else statement.

i. if average is greater than or equal to 75 --> Grade A
ii. if average is less than 75 and greater than equal to 65 --> Grade B
iii. if average is less than 65 and greater than equal to 55 --> Grade C
iv. if average is less than 55 and greater than equal to 45 --> Grade D
v. if average is less than 45 --> Fail

program-2: write a program to calculate the electricity bill amount based 
           on the units.

i. 1 to 100 --> 2.50
ii. 101 to 300 --> 3.50
iii. 301 to 500 --> 4.50            
iv. 501 to 1000 --> 5.50
v. 1000+ --> 6.50  */


/*public class grades{
    public static void main(String[] args){ 

        int subject1 = 35;
        int subject2 = 30;
        int subject3 = 40;

        int total = subject1 + subject2 + subject3;
        double average = total / 3.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        if (average >= 75) {
            System.out.println("Grade: A");
        } else if (average >= 65) {
            System.out.println("Grade: B");
        } else if (average >= 55) {
            System.out.println("Grade: C");
        } else if (average >= 45) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Result: Fail");
        }
    }
}*/


public class electricitybill{
    public static void main(String[] args)
    { 
        double units = 99.0;
 if(units > 1 && units < 100)
 {
  float bill= units*2.50;
  System.out.println("bill = " + bill);
 }
}
}
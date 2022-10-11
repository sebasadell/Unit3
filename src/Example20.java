import java.util.Scanner;

public class Example20 {
 public static void main(String[] argv) {
     int year;
     boolean leapYear;
     System.out.println("Enter a year:");

     Scanner inputValue;
     inputValue = new Scanner(System.in);
     year = inputValue.nextInt();

    if (year % 4 == 0) {
        if (year % 100 == 0 && year % 400 != 0) {
            leapYear = false;
        }
        else {
            leapYear = true;
        }
    }
    else{
        leapYear = false;
        }

    if (leapYear) {
         System.out.println("It's a leap year");
     }
    else{
         System.out.println("It's not a leap year");
     }
 }
}
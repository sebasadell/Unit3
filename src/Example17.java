import java.util.Scanner;

public class Example17 {
    public static void main(String[] argv){
        int hours;
        int minutes;
        int seconds;
        Scanner inputValue;
        System.out.println("Enter the hours: ");
        inputValue = new Scanner(System.in);
        hours = inputValue.nextInt();

        System.out.println("Enter the minutes: ");
        inputValue = new Scanner(System.in);
        minutes = inputValue.nextInt();

        System.out.println("Enter the seconds: ");
        inputValue = new Scanner(System.in);
        seconds = inputValue.nextInt();

        seconds = seconds +1;
        if (seconds == 60){
            seconds = 00;
            minutes = minutes + 1;
            if (minutes == 60){
                minutes = 00;
                hours = hours + 1;
                if (hours == 24){
                    hours = 00;
                }
            }
        }
        System.out.println("Time is: " + hours + ":" + minutes + ":" + seconds);
    }
}
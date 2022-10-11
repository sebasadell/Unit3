import java.util.Scanner;

public class Example26 {
    public static void main(String[] argv) {
        int num;
        Scanner inputValue;
        System.out.println("Enter a number to calculate its divisors:");
        inputValue = new Scanner(System.in);
        num = inputValue.nextInt();

        for (int i = num; i >= 1; i--) {
            if (num % i == 0) {
                System.out.println(i + " is a divisor");
            }
        }
    }
}
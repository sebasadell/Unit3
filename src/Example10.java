import java.util.Scanner;

public class Example10 {
    public static void main(String[] argv) {
        int x;

        System.out.println("Enter a number:");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        x = inputValue.nextInt();

        if (x > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }
}
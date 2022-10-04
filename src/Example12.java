import java.util.Scanner;

public class Example12 {
    public static void main(String[] argv) {
        int x;
        int y;

        System.out.println("Enter the first number:");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        x = inputValue.nextInt();

        System.out.println("Enter the second number: ");
        inputValue = new Scanner(System.in);
        y = inputValue.nextInt();

        if (x > y) {
            System.out.println("The bigger number is: "+x);
        } else {
            System.out.println("The bigger number is: "+y);
        }
    }
}

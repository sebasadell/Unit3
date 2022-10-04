import java.util.Scanner;

public class Example11 {
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

        if (x < y) {
            System.out.println(x+", "+y);
        } else {
            System.out.println(y+", "+x);
        }
    }
}
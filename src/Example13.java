import java.util.Scanner;

public class Example13 {
    public static void main(String[] argv) {
        int x;
        int y;
        int z;

        System.out.println("Enter the first number:");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        x = inputValue.nextInt();

        System.out.println("Enter the second number: ");
        inputValue = new Scanner(System.in);
        y = inputValue.nextInt();

        System.out.println("Enter the third number: ");
        inputValue = new Scanner(System.in);
        z = inputValue.nextInt();

        if (x > y && x > z) {
            System.out.println("The bigger number is: "+x);
        }

        if (y > x && y > z) {
            System.out.println("The bigger number is: "+y);
        }

        if (z > x && z > y) {
            System.out.println("The bigger number is: "+z);
        }
    }
}
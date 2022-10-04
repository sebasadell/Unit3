import java.util.Scanner;

public class Example14 {
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

        if (x < y && y < z) {
            System.out.println(x+", "+y+", "+z);
        }

        if (x < z && z < y) {
            System.out.println(x+", "+z+", "+y);
        }

        if (y < x && x < z) {
            System.out.println(y+", "+x+", "+z);
        }

        if (y < z && z < x) {
            System.out.println(y+", "+z+", "+x);
        }

        if (z < x && x < y) {
            System.out.println(z+", "+x+", "+y);
        }

        if (z < y && y < x) {
            System.out.println(z+", "+y+", "+x);
        }
    }
}